package com.example.wishlist.model.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WishListItem {

    private int id;
    private int product_id ;
}
