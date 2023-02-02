package com.example.wishlist.model.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListPK implements Serializable {

    @Column(name = "\"wishListId\"")
    private int wishListId;
    @Column(name = "\"customerId\"")
    private String customerId;
}
