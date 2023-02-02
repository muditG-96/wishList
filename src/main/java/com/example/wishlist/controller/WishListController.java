package com.example.wishlist.controller;

import com.example.wishlist.client.ApiClient;
import com.example.wishlist.client.SoapClient;
import com.example.wishlist.customer.v3_1.AddWishlistItemsResponse;
import com.example.wishlist.model.in.OrceToken;
import com.example.wishlist.model.in.WishListDto;
import com.example.wishlist.model.out.CustWishlist;
import com.example.wishlist.model.out.CustWishlistTmp;
import com.example.wishlist.model.out.WishListPK;
import com.example.wishlist.service.CustWishlistRepository;
import com.example.wishlist.service.CustomerWishlistService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class WishListController {

    private final ApiClient apiClient;

    private final SoapClient soapClient;

    private final CustomerWishlistService customerWishlistService;

    private final CustWishlistRepository custWishlistRepository;

    @GetMapping(value = "/wishlist" , produces = MediaType.APPLICATION_JSON_VALUE)
    public WishListDto fetchAllWishList(){

        Optional<CustWishlistTmp> custWishlist = custWishlistRepository.findById(new WishListPK(169,"24"));
        WishListDto wishListDto = apiClient.getAllWishlist();
        OrceToken token = apiClient.getOrceToken();
        log.info("Token received is {}" , token.getAccess_token());
        AddWishlistItemsResponse response = soapClient.addWishListItem(token.getAccess_token());
        log.info("wish list response is {}" , response.getCustomerId());
        if(custWishlist.isPresent()){
            log.info(custWishlist.get().toString());
        }
        customerWishlistService.processWishList(wishListDto.getData());
        return wishListDto;
    }
}
