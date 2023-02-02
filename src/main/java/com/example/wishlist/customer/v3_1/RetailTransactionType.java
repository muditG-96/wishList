
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailTransactionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItem" type="{http://v3_1.customer.webservices.csx.dtv.com/}LineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://v3_1.customer.webservices.csx.dtv.com/}TotalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerAccount" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerAccountType" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://v3_1.customer.webservices.csx.dtv.com/}PoslogCustomerType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLink" type="{http://v3_1.customer.webservices.csx.dtv.com/}TransactionLinkType" minOccurs="0"/&gt;
 *         &lt;element name="PostVoidReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostVoidComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailTransactionType", propOrder = {
    "lineItem",
    "total",
    "customerAccount",
    "customer",
    "transactionLink",
    "postVoidReasonCode",
    "postVoidComment"
})
public class RetailTransactionType {

    @XmlElement(name = "LineItem")
    protected List<LineItemType> lineItem;
    @XmlElement(name = "Total")
    protected List<TotalType> total;
    @XmlElement(name = "CustomerAccount")
    protected CustomerAccountType customerAccount;
    @XmlElement(name = "Customer")
    protected PoslogCustomerType customer;
    @XmlElement(name = "TransactionLink")
    protected TransactionLinkType transactionLink;
    @XmlElement(name = "PostVoidReasonCode")
    protected String postVoidReasonCode;
    @XmlElement(name = "PostVoidComment")
    protected String postVoidComment;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "TypeCode")
    protected String typeCode;
    @XmlAttribute(name = "TransactionStatus")
    protected String transactionStatus;

    /**
     * Gets the value of the lineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<LineItemType>();
        }
        return this.lineItem;
    }

    /**
     * Gets the value of the total property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the total property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalType }
     * 
     * 
     */
    public List<TotalType> getTotal() {
        if (total == null) {
            total = new ArrayList<TotalType>();
        }
        return this.total;
    }

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountType }
     *     
     */
    public CustomerAccountType getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountType }
     *     
     */
    public void setCustomerAccount(CustomerAccountType value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link PoslogCustomerType }
     *     
     */
    public PoslogCustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoslogCustomerType }
     *     
     */
    public void setCustomer(PoslogCustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the transactionLink property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLinkType }
     *     
     */
    public TransactionLinkType getTransactionLink() {
        return transactionLink;
    }

    /**
     * Sets the value of the transactionLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLinkType }
     *     
     */
    public void setTransactionLink(TransactionLinkType value) {
        this.transactionLink = value;
    }

    /**
     * Gets the value of the postVoidReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostVoidReasonCode() {
        return postVoidReasonCode;
    }

    /**
     * Sets the value of the postVoidReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostVoidReasonCode(String value) {
        this.postVoidReasonCode = value;
    }

    /**
     * Gets the value of the postVoidComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostVoidComment() {
        return postVoidComment;
    }

    /**
     * Sets the value of the postVoidComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostVoidComment(String value) {
        this.postVoidComment = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

}
