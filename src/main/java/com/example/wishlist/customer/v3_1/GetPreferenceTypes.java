
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPreferenceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPreferenceTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preferenceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "getPreferenceTypes", propOrder = {
    "preferenceTypeId",
    "securityUserId"
})
public class GetPreferenceTypes {

    protected long preferenceTypeId;
    protected String securityUserId;

    /**
     * Gets the value of the preferenceTypeId property.
     * 
     */
    public long getPreferenceTypeId() {
        return preferenceTypeId;
    }

    /**
     * Sets the value of the preferenceTypeId property.
     * 
     */
    public void setPreferenceTypeId(long value) {
        this.preferenceTypeId = value;
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
