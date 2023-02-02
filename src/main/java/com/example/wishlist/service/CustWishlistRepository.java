package com.example.wishlist.service;

import com.example.wishlist.model.out.CustWishlist;
import com.example.wishlist.model.out.CustWishlistTmp;
import com.example.wishlist.model.out.WishListPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustWishlistRepository extends CrudRepository<CustWishlistTmp, WishListPK> {

    @Procedure(name= "\"Wishlist\"")
    void callProcedureWishlist();
}
