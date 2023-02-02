package com.example.wishlist.service;

import com.example.wishlist.model.in.CustomerWishList;
import com.example.wishlist.model.in.WishListItem;
import com.example.wishlist.model.out.CustWishlist;
import com.example.wishlist.model.out.CustWishlistTmp;
import com.example.wishlist.model.out.WishListPK;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomerWishlistService {

    private final CustWishlistRepository custWishlistRepository;

    public void processWishList(List<CustomerWishList> wishList) {
        List<CustWishlistTmp> custWishlistsTmp = new ArrayList<>();

        for (CustomerWishList customerWishList : wishList) {
            if (!customerWishList.getItems().isEmpty()) {
                for (WishListItem wishListItem : customerWishList.getItems()) {
                    CustWishlistTmp custWishlistTmp = new CustWishlistTmp();
                    WishListPK wishListPK = new WishListPK(wishListItem.getId(), String.valueOf(customerWishList.getCustomer_id()));
                    custWishlistTmp.setWishListPK(wishListPK);
                    custWishlistTmp.setWishListName(customerWishList.getName());
                    custWishlistTmp.setWishListProductId(String.valueOf(wishListItem.getProduct_id()));
                    custWishlistsTmp.add(custWishlistTmp);
                }
            }
        }

        custWishlistRepository.saveAll(custWishlistsTmp);
        //custWishlistRepository.callProcedureWishlist();
    }
}
