
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociateAssignmentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociateAssignmentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlternateKey" type="{http://v3_1.customer.webservices.csx.dtv.com/}AlternateKeyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssociateAssignments" type="{http://v3_1.customer.webservices.csx.dtv.com/}AssociateAssignmentsContainerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociateAssignmentRequestType", propOrder = {
    "customerID",
    "alternateKey",
    "cardNumber",
    "cardSerialNumber",
    "associateAssignments"
})
public class AssociateAssignmentRequestType {

    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "AlternateKey")
    protected List<AlternateKeyType> alternateKey;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "CardSerialNumber")
    protected String cardSerialNumber;
    @XmlElement(name = "AssociateAssignments")
    protected AssociateAssignmentsContainerType associateAssignments;

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
     * Gets the value of the cardSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSerialNumber() {
        return cardSerialNumber;
    }

    /**
     * Sets the value of the cardSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSerialNumber(String value) {
        this.cardSerialNumber = value;
    }

    /**
     * Gets the value of the associateAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link AssociateAssignmentsContainerType }
     *     
     */
    public AssociateAssignmentsContainerType getAssociateAssignments() {
        return associateAssignments;
    }

    /**
     * Sets the value of the associateAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociateAssignmentsContainerType }
     *     
     */
    public void setAssociateAssignments(AssociateAssignmentsContainerType value) {
        this.associateAssignments = value;
    }

}
