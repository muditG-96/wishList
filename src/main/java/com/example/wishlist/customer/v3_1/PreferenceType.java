
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preferenceTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preferenceTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultFrequencyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferenceType", propOrder = {
    "preferenceTypeId",
    "preferenceTypeName",
    "defaultFrequencyTypeCode"
})
public class PreferenceType {

    @XmlElement(required = true)
    protected String preferenceTypeId;
    @XmlElement(required = true)
    protected String preferenceTypeName;
    protected String defaultFrequencyTypeCode;

    /**
     * Gets the value of the preferenceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceTypeId() {
        return preferenceTypeId;
    }

    /**
     * Sets the value of the preferenceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceTypeId(String value) {
        this.preferenceTypeId = value;
    }

    /**
     * Gets the value of the preferenceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceTypeName() {
        return preferenceTypeName;
    }

    /**
     * Sets the value of the preferenceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceTypeName(String value) {
        this.preferenceTypeName = value;
    }

    /**
     * Gets the value of the defaultFrequencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultFrequencyTypeCode() {
        return defaultFrequencyTypeCode;
    }

    /**
     * Sets the value of the defaultFrequencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultFrequencyTypeCode(String value) {
        this.defaultFrequencyTypeCode = value;
    }

}
