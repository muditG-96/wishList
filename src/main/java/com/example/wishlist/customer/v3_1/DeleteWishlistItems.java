
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteWishlistItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteWishlistItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wishlistData" type="{http://v3_1.customer.webservices.csx.dtv.com/}WishlistItemRequestType" minOccurs="0"/&gt;
 *         &lt;element name="securityUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteWishlistItems", propOrder = {
    "wishlistData",
    "securityUserId"
})
public class DeleteWishlistItems {

    protected WishlistItemRequestType wishlistData;
    protected String securityUserId;

    /**
     * Gets the value of the wishlistData property.
     * 
     * @return
     *     possible object is
     *     {@link WishlistItemRequestType }
     *     
     */
    public WishlistItemRequestType getWishlistData() {
        return wishlistData;
    }

    /**
     * Sets the value of the wishlistData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WishlistItemRequestType }
     *     
     */
    public void setWishlistData(WishlistItemRequestType value) {
        this.wishlistData = value;
    }

    /**
     * Gets the value of the securityUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityUserId() {
        return securityUserId;
    }

    /**
     * Sets the value of the securityUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityUserId(String value) {
        this.securityUserId = value;
    }

}
