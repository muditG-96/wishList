
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YearToDateActivitySummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearToDateActivitySummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="YearToDateReturnsAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YearToDateSalesAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YearToDateTransactionCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YearToDateItemsSoldCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YearToDateItemsReturnedCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearToDateActivitySummaryType", propOrder = {
    "yearToDateReturnsAmount",
    "yearToDateSalesAmount",
    "yearToDateTransactionCount",
    "yearToDateItemsSoldCount",
    "yearToDateItemsReturnedCount"
})
public class YearToDateActivitySummaryType {

    @XmlElement(name = "YearToDateReturnsAmount")
    protected String yearToDateReturnsAmount;
    @XmlElement(name = "YearToDateSalesAmount")
    protected String yearToDateSalesAmount;
    @XmlElement(name = "YearToDateTransactionCount")
    protected String yearToDateTransactionCount;
    @XmlElement(name = "YearToDateItemsSoldCount")
    protected String yearToDateItemsSoldCount;
    @XmlElement(name = "YearToDateItemsReturnedCount")
    protected String yearToDateItemsReturnedCount;

    /**
     * Gets the value of the yearToDateReturnsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearToDateReturnsAmount() {
        return yearToDateReturnsAmount;
    }

    /**
     * Sets the value of the yearToDateReturnsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearToDateReturnsAmount(String value) {
        this.yearToDateReturnsAmount = value;
    }

    /**
     * Gets the value of the yearToDateSalesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearToDateSalesAmount() {
        return yearToDateSalesAmount;
    }

    /**
     * Sets the value of the yearToDateSalesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearToDateSalesAmount(String value) {
        this.yearToDateSalesAmount = value;
    }

    /**
     * Gets the value of the yearToDateTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearToDateTransactionCount() {
        return yearToDateTransactionCount;
    }

    /**
     * Sets the value of the yearToDateTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearToDateTransactionCount(String value) {
        this.yearToDateTransactionCount = value;
    }

    /**
     * Gets the value of the yearToDateItemsSoldCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearToDateItemsSoldCount() {
        return yearToDateItemsSoldCount;
    }

    /**
     * Sets the value of the yearToDateItemsSoldCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearToDateItemsSoldCount(String value) {
        this.yearToDateItemsSoldCount = value;
    }

    /**
     * Gets the value of the yearToDateItemsReturnedCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearToDateItemsReturnedCount() {
        return yearToDateItemsReturnedCount;
    }

    /**
     * Sets the value of the yearToDateItemsReturnedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearToDateItemsReturnedCount(String value) {
        this.yearToDateItemsReturnedCount = value;
    }

}
