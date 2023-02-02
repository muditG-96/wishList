
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosTransactionPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PosTransactionPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PosTransactionPropertyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PosTransactionPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosTransactionPropertiesType", propOrder = {
    "posTransactionPropertyCode",
    "posTransactionPropertyValue"
})
public class PosTransactionPropertiesType {

    @XmlElement(name = "PosTransactionPropertyCode", required = true)
    protected String posTransactionPropertyCode;
    @XmlElement(name = "PosTransactionPropertyValue", required = true)
    protected String posTransactionPropertyValue;

    /**
     * Gets the value of the posTransactionPropertyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosTransactionPropertyCode() {
        return posTransactionPropertyCode;
    }

    /**
     * Sets the value of the posTransactionPropertyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosTransactionPropertyCode(String value) {
        this.posTransactionPropertyCode = value;
    }

    /**
     * Gets the value of the posTransactionPropertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosTransactionPropertyValue() {
        return posTransactionPropertyValue;
    }

    /**
     * Sets the value of the posTransactionPropertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosTransactionPropertyValue(String value) {
        this.posTransactionPropertyValue = value;
    }

}
