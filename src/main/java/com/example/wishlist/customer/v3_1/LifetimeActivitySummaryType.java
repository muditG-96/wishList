
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifetimeActivitySummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifetimeActivitySummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalReturnsAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalSalesAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalTransactionCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalItemsSoldCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalItemsReturnedCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifetimeActivitySummaryType", propOrder = {
    "totalReturnsAmount",
    "totalSalesAmount",
    "totalTransactionCount",
    "totalItemsSoldCount",
    "totalItemsReturnedCount"
})
public class LifetimeActivitySummaryType {

    @XmlElement(name = "TotalReturnsAmount")
    protected String totalReturnsAmount;
    @XmlElement(name = "TotalSalesAmount")
    protected String totalSalesAmount;
    @XmlElement(name = "TotalTransactionCount")
    protected String totalTransactionCount;
    @XmlElement(name = "TotalItemsSoldCount")
    protected String totalItemsSoldCount;
    @XmlElement(name = "TotalItemsReturnedCount")
    protected String totalItemsReturnedCount;

    /**
     * Gets the value of the totalReturnsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalReturnsAmount() {
        return totalReturnsAmount;
    }

    /**
     * Sets the value of the totalReturnsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalReturnsAmount(String value) {
        this.totalReturnsAmount = value;
    }

    /**
     * Gets the value of the totalSalesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSalesAmount() {
        return totalSalesAmount;
    }

    /**
     * Sets the value of the totalSalesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSalesAmount(String value) {
        this.totalSalesAmount = value;
    }

    /**
     * Gets the value of the totalTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTransactionCount() {
        return totalTransactionCount;
    }

    /**
     * Sets the value of the totalTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTransactionCount(String value) {
        this.totalTransactionCount = value;
    }

    /**
     * Gets the value of the totalItemsSoldCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalItemsSoldCount() {
        return totalItemsSoldCount;
    }

    /**
     * Sets the value of the totalItemsSoldCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalItemsSoldCount(String value) {
        this.totalItemsSoldCount = value;
    }

    /**
     * Gets the value of the totalItemsReturnedCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalItemsReturnedCount() {
        return totalItemsReturnedCount;
    }

    /**
     * Sets the value of the totalItemsReturnedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalItemsReturnedCount(String value) {
        this.totalItemsReturnedCount = value;
    }

}
