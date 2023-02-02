
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemVisualizerRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemVisualizerRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VisualizerItems" type="{http://v3_1.customer.webservices.csx.dtv.com/}ItemVisualizerContainerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemVisualizerRequestType", propOrder = {
    "customerID",
    "visualizerItems"
})
public class ItemVisualizerRequestType {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "VisualizerItems")
    protected ItemVisualizerContainerType visualizerItems;

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
     * Gets the value of the visualizerItems property.
     * 
     * @return
     *     possible object is
     *     {@link ItemVisualizerContainerType }
     *     
     */
    public ItemVisualizerContainerType getVisualizerItems() {
        return visualizerItems;
    }

    /**
     * Sets the value of the visualizerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemVisualizerContainerType }
     *     
     */
    public void setVisualizerItems(ItemVisualizerContainerType value) {
        this.visualizerItems = value;
    }

}
