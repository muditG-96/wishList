
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WishlistItemsContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WishlistItemsContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WishlistItem" type="{http://v3_1.customer.webservices.csx.dtv.com/}WishlistItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WishlistItemsContainerType", propOrder = {
    "wishlistItem"
})
public class WishlistItemsContainerType {

    @XmlElement(name = "WishlistItem")
    protected List<WishlistItemType> wishlistItem;

    /**
     * Gets the value of the wishlistItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wishlistItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWishlistItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WishlistItemType }
     * 
     * 
     */
    public List<WishlistItemType> getWishlistItem() {
        if (wishlistItem == null) {
            wishlistItem = new ArrayList<WishlistItemType>();
        }
        return this.wishlistItem;
    }

}
