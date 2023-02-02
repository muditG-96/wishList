
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoyaltyAccount" type="{http://v3_1.customer.webservices.csx.dtv.com/}LoyaltyAccountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountType", propOrder = {
    "loyaltyAccount"
})
public class CustomerAccountType {

    @XmlElement(name = "LoyaltyAccount", required = true)
    protected LoyaltyAccountType loyaltyAccount;

    /**
     * Gets the value of the loyaltyAccount property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccountType }
     *     
     */
    public LoyaltyAccountType getLoyaltyAccount() {
        return loyaltyAccount;
    }

    /**
     * Sets the value of the loyaltyAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountType }
     *     
     */
    public void setLoyaltyAccount(LoyaltyAccountType value) {
        this.loyaltyAccount = value;
    }

}
