
package com.example.wishlist.customer.v3_1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxOverrideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxOverrideType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OriginalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NewTaxPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NewTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxOverrideType", propOrder = {
    "originalPercent",
    "originalTaxAmount",
    "newTaxPercent",
    "newTaxAmount",
    "reasonCode"
})
public class TaxOverrideType {

    @XmlElement(name = "OriginalPercent")
    protected BigDecimal originalPercent;
    @XmlElement(name = "OriginalTaxAmount")
    protected BigDecimal originalTaxAmount;
    @XmlElement(name = "NewTaxPercent")
    protected BigDecimal newTaxPercent;
    @XmlElement(name = "NewTaxAmount")
    protected BigDecimal newTaxAmount;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;

    /**
     * Gets the value of the originalPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalPercent() {
        return originalPercent;
    }

    /**
     * Sets the value of the originalPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalPercent(BigDecimal value) {
        this.originalPercent = value;
    }

    /**
     * Gets the value of the originalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalTaxAmount() {
        return originalTaxAmount;
    }

    /**
     * Sets the value of the originalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalTaxAmount(BigDecimal value) {
        this.originalTaxAmount = value;
    }

    /**
     * Gets the value of the newTaxPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewTaxPercent() {
        return newTaxPercent;
    }

    /**
     * Sets the value of the newTaxPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewTaxPercent(BigDecimal value) {
        this.newTaxPercent = value;
    }

    /**
     * Gets the value of the newTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewTaxAmount() {
        return newTaxAmount;
    }

    /**
     * Sets the value of the newTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewTaxAmount(BigDecimal value) {
        this.newTaxAmount = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

}
