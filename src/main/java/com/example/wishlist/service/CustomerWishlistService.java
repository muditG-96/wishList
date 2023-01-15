package com.example.wishlist.service;

import com.example.wishlist.model.in.CustomerWishList;
import com.example.wishlist.model.in.WishListItem;
import com.example.wishlist.model.out.CustWishlist;
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
        List<CustWishlist> custWishlists = new ArrayList<>();

        for (CustomerWishList customerWishList : wishList) {
            if (!customerWishList.getItems().isEmpty()) {
                for (WishListItem wishListItem : customerWishList.getItems()) {
                    CustWishlist custWishlist = new CustWishlist();
                    WishListPK wishListPK = new WishListPK(wishListItem.getId(), String.valueOf(customerWishList.getCustomer_id()));
                    custWishlist.setWishListPK(wishListPK);
                    custWishlist.setWishListName(customerWishList.getName());
                    custWishlist.setWishListProductId(String.valueOf(wishListItem.getProduct_id()));
                    custWishlists.add(custWishlist);
                }
            }
        }

        custWishlistRepository.saveAll(custWishlists);
    }
}
