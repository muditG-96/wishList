
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxExemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerExemptionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExemptTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxExemptionType", propOrder = {
    "customerExemptionID",
    "exemptTaxAmount"
})
public class TaxExemptionType {

    @XmlElement(name = "CustomerExemptionID")
    protected String customerExemptionID;
    @XmlElement(name = "ExemptTaxAmount", required = true)
    protected String exemptTaxAmount;

    /**
     * Gets the value of the customerExemptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerExemptionID() {
        return customerExemptionID;
    }

    /**
     * Sets the value of the customerExemptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerExemptionID(String value) {
        this.customerExemptionID = value;
    }

    /**
     * Gets the value of the exemptTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptTaxAmount() {
        return exemptTaxAmount;
    }

    /**
     * Sets the value of the exemptTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptTaxAmount(String value) {
        this.exemptTaxAmount = value;
    }

}
