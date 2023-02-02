
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WishlistItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WishlistItemRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WishlistItems" type="{http://v3_1.customer.webservices.csx.dtv.com/}WishlistItemsContainerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WishlistItemRequestType", propOrder = {
    "customerID",
    "wishlistItems"
})
public class WishlistItemRequestType {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "WishlistItems")
    protected WishlistItemsContainerType wishlistItems;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the wishlistItems property.
     * 
     * @return
     *     possible object is
     *     {@link WishlistItemsContainerType }
     *     
     */
    public WishlistItemsContainerType getWishlistItems() {
        return wishlistItems;
    }

    /**
     * Sets the value of the wishlistItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link WishlistItemsContainerType }
     *     
     */
    public void setWishlistItems(WishlistItemsContainerType value) {
        this.wishlistItems = value;
    }

}
