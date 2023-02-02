
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PrimaryAccountHolderFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AccountId" type="{http://v3_1.customer.webservices.csx.dtv.com/}AccountIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentReturnType", propOrder = {
    "cardNumber",
    "cardSerialNumber",
    "primaryAccountHolderFlag",
    "accountId"
})
public class InstrumentReturnType {

    @XmlElement(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlElement(name = "CardSerialNumber", required = true)
    protected String cardSerialNumber;
    @XmlElement(name = "PrimaryAccountHolderFlag")
    protected boolean primaryAccountHolderFlag;
    @XmlElement(name = "AccountId")
    protected List<AccountIdType> accountId;
    @XmlAttribute(name = "Description")
    protected String description;

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
     * Gets the value of the primaryAccountHolderFlag property.
     * 
     */
    public boolean isPrimaryAccountHolderFlag() {
        return primaryAccountHolderFlag;
    }

    /**
     * Sets the value of the primaryAccountHolderFlag property.
     * 
     */
    public void setPrimaryAccountHolderFlag(boolean value) {
        this.primaryAccountHolderFlag = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdType }
     * 
     * 
     */
    public List<AccountIdType> getAccountId() {
        if (accountId == null) {
            accountId = new ArrayList<AccountIdType>();
        }
        return this.accountId;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
