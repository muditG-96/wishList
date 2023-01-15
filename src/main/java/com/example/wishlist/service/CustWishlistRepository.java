package com.example.wishlist.service;

import com.example.wishlist.model.out.CustWishlist;
import com.example.wishlist.model.out.WishListPK;
import org.springframework.data.repository.CrudRepository;

public interface CustWishlistRepository extends CrudRepository<CustWishlist, WishListPK> {
}
