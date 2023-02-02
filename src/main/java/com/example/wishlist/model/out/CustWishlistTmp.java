package com.example.wishlist.model.out;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"Cust_wishlist_temp\"")
@Data
public class CustWishlistTmp {

    @EmbeddedId
    private WishListPK wishListPK;
    @Column(name = "\"wishListName\"")
    private String wishListName;

    @Column(name = "\"wishListItemId\"")
    private String wishListItemId;
    @Column(name = "\"wishListProductId\"")
    private String wishListProductId;
}
