
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFranchiseeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFranchiseeRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AlternateKey" type="{http://v3_1.customer.webservices.csx.dtv.com/}AlternateKeyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerFranchisees" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerFranchiseeContainerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFranchiseeRequestType", propOrder = {
    "customerID",
    "alternateKey",
    "cardNumber",
    "customerFranchisees"
})
public class CustomerFranchiseeRequestType {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "AlternateKey")
    protected List<AlternateKeyType> alternateKey;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CustomerFranchisees")
    protected CustomerFranchiseeContainerType customerFranchisees;

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
     * Gets the value of the alternateKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateKeyType }
     * 
     * 
     */
    public List<AlternateKeyType> getAlternateKey() {
        if (alternateKey == null) {
            alternateKey = new ArrayList<AlternateKeyType>();
        }
        return this.alternateKey;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the customerFranchisees property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFranchiseeContainerType }
     *     
     */
    public CustomerFranchiseeContainerType getCustomerFranchisees() {
        return customerFranchisees;
    }

    /**
     * Sets the value of the customerFranchisees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFranchiseeContainerType }
     *     
     */
    public void setCustomerFranchisees(CustomerFranchiseeContainerType value) {
        this.customerFranchisees = value;
    }

}
