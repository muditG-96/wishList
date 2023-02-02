
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Transactions" type="{http://v3_1.customer.webservices.csx.dtv.com/}TransactionContainerReturnType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaskData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReturnType", propOrder = {
    "customerID",
    "transactions",
    "securityPrivilege",
    "maskData"
})
public class TransactionReturnType {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "Transactions")
    protected TransactionContainerReturnType transactions;
    @XmlElement(name = "SecurityPrivilege")
    protected String securityPrivilege;
    @XmlElement(name = "MaskData")
    protected boolean maskData;

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
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContainerReturnType }
     *     
     */
    public TransactionContainerReturnType getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContainerReturnType }
     *     
     */
    public void setTransactions(TransactionContainerReturnType value) {
        this.transactions = value;
    }

    /**
     * Gets the value of the securityPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPrivilege() {
        return securityPrivilege;
    }

    /**
     * Sets the value of the securityPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPrivilege(String value) {
        this.securityPrivilege = value;
    }

    /**
     * Gets the value of the maskData property.
     * 
     */
    public boolean isMaskData() {
        return maskData;
    }

    /**
     * Sets the value of the maskData property.
     * 
     */
    public void setMaskData(boolean value) {
        this.maskData = value;
    }

}
