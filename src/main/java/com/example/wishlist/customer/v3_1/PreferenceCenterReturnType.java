
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferenceCenterReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceCenterReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PreferenceCenters" type="{http://v3_1.customer.webservices.csx.dtv.com/}PreferenceCenterContainerReturnType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaskData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferenceCenterReturnType", propOrder = {
    "customerID",
    "preferenceCenters",
    "securityPrivilege",
    "maskData"
})
public class PreferenceCenterReturnType {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "PreferenceCenters")
    protected PreferenceCenterContainerReturnType preferenceCenters;
    @XmlElement(name = "SecurityPrivilege")
    protected String securityPrivilege;
    @XmlElement(name = "MaskData")
    protected boolean maskData;

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
     * Gets the value of the preferenceCenters property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceCenterContainerReturnType }
     *     
     */
    public PreferenceCenterContainerReturnType getPreferenceCenters() {
        return preferenceCenters;
    }

    /**
     * Sets the value of the preferenceCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceCenterContainerReturnType }
     *     
     */
    public void setPreferenceCenters(PreferenceCenterContainerReturnType value) {
        this.preferenceCenters = value;
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

}
