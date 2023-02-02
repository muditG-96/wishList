
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentStrataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentStrataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StrataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StrataFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BasedOnValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StrataField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AverageStrataValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfStrata" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerStrata" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentStrataType", propOrder = {
    "strataType",
    "strataFormat",
    "basedOnValue",
    "strataField",
    "averageStrataValue",
    "numberOfStrata",
    "customerStrata",
    "customerValue"
})
public class SegmentStrataType {

    @XmlElement(name = "StrataType")
    protected String strataType;
    @XmlElement(name = "StrataFormat")
    protected String strataFormat;
    @XmlElement(name = "BasedOnValue")
    protected String basedOnValue;
    @XmlElement(name = "StrataField")
    protected String strataField;
    @XmlElement(name = "AverageStrataValue")
    protected Long averageStrataValue;
    @XmlElement(name = "NumberOfStrata")
    protected Long numberOfStrata;
    @XmlElement(name = "CustomerStrata")
    protected Long customerStrata;
    @XmlElement(name = "CustomerValue")
    protected Long customerValue;

    /**
     * Gets the value of the strataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrataType() {
        return strataType;
    }

    /**
     * Sets the value of the strataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrataType(String value) {
        this.strataType = value;
    }

    /**
     * Gets the value of the strataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrataFormat() {
        return strataFormat;
    }

    /**
     * Sets the value of the strataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrataFormat(String value) {
        this.strataFormat = value;
    }

    /**
     * Gets the value of the basedOnValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasedOnValue() {
        return basedOnValue;
    }

    /**
     * Sets the value of the basedOnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasedOnValue(String value) {
        this.basedOnValue = value;
    }

    /**
     * Gets the value of the strataField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrataField() {
        return strataField;
    }

    /**
     * Sets the value of the strataField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrataField(String value) {
        this.strataField = value;
    }

    /**
     * Gets the value of the averageStrataValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAverageStrataValue() {
        return averageStrataValue;
    }

    /**
     * Sets the value of the averageStrataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAverageStrataValue(Long value) {
        this.averageStrataValue = value;
    }

    /**
     * Gets the value of the numberOfStrata property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfStrata() {
        return numberOfStrata;
    }

    /**
     * Sets the value of the numberOfStrata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfStrata(Long value) {
        this.numberOfStrata = value;
    }

    /**
     * Gets the value of the customerStrata property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerStrata() {
        return customerStrata;
    }

    /**
     * Sets the value of the customerStrata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerStrata(Long value) {
        this.customerStrata = value;
    }

    /**
     * Gets the value of the customerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerValue() {
        return customerValue;
    }

    /**
     * Sets the value of the customerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerValue(Long value) {
        this.customerValue = value;
    }

}
