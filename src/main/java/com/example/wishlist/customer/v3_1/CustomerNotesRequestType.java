
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerNotesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerNotesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerNotesContainer" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerNotesContainerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerNotesRequestType", propOrder = {
    "customerID",
    "customerNotesContainer"
})
public class CustomerNotesRequestType {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "CustomerNotesContainer")
    protected CustomerNotesContainerType customerNotesContainer;

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
     * Gets the value of the customerNotesContainer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNotesContainerType }
     *     
     */
    public CustomerNotesContainerType getCustomerNotesContainer() {
        return customerNotesContainer;
    }

    /**
     * Sets the value of the customerNotesContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNotesContainerType }
     *     
     */
    public void setCustomerNotesContainer(CustomerNotesContainerType value) {
        this.customerNotesContainer = value;
    }

}
