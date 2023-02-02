
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionEventReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionEventReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromotionEvents" type="{http://v3_1.customer.webservices.csx.dtv.com/}PromotionEventContainerReturnType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaskData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SystemCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionEventReturnType", propOrder = {
    "customerID",
    "promotionEvents",
    "securityPrivilege",
    "maskData",
    "systemCurrencyCode"
})
public class PromotionEventReturnType {

    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "PromotionEvents")
    protected PromotionEventContainerReturnType promotionEvents;
    @XmlElement(name = "SecurityPrivilege")
    protected String securityPrivilege;
    @XmlElement(name = "MaskData")
    protected boolean maskData;
    @XmlElement(name = "SystemCurrencyCode", required = true)
    protected String systemCurrencyCode;

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
     * Gets the value of the promotionEvents property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionEventContainerReturnType }
     *     
     */
    public PromotionEventContainerReturnType getPromotionEvents() {
        return promotionEvents;
    }

    /**
     * Sets the value of the promotionEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionEventContainerReturnType }
     *     
     */
    public void setPromotionEvents(PromotionEventContainerReturnType value) {
        this.promotionEvents = value;
    }

    /**
     * Gets the value of the securityPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPrivilege() {
        return securityPrivilege;
    }

    /**
     * Sets the value of the securityPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPrivilege(String value) {
        this.securityPrivilege = value;
    }

    /**
     * Gets the value of the maskData property.
     * 
     */
    public boolean isMaskData() {
        return maskData;
    }

    /**
     * Sets the value of the maskData property.
     * 
     */
    public void setMaskData(boolean value) {
        this.maskData = value;
    }

    /**
     * Gets the value of the systemCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCurrencyCode() {
        return systemCurrencyCode;
    }

    /**
     * Sets the value of the systemCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCurrencyCode(String value) {
        this.systemCurrencyCode = value;
    }

}
