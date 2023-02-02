package com.example.wishlist.model.out;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "\"Cust_wishlist\"")
@Data
public class CustWishlist {

    @EmbeddedId
    private WishListPK wishListPK;
    @Column(name = "\"wishListName\"")
    private String wishListName;

    @Column(name = "\"wishListItemId\"")
    private String wishListItemId;
    @Column(name = "\"wishListProductId\"")
    private String wishListProductId;
}
