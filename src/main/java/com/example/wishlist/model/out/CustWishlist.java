package com.example.wishlist.model.out;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CustWishlist {

    @EmbeddedId
    private WishListPK wishListPK;
    @Column(name = "wishListName")
    private String wishListName;

    @Column(name = "wishListItemId")
    private String wishListItemId;
    @Column(name = "wishListProductId")
    private String wishListProductId;
}
