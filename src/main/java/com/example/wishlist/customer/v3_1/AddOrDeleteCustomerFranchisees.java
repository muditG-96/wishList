
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOrDeleteCustomerFranchisees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOrDeleteCustomerFranchisees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerFranchisees" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerFranchiseeRequestType"/&gt;
 *         &lt;element name="updateUserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="securityUserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOrDeleteCustomerFranchisees", propOrder = {
    "customerFranchisees",
    "updateUserId",
    "securityUserId"
})
public class AddOrDeleteCustomerFranchisees {

    @XmlElement(required = true)
    protected CustomerFranchiseeRequestType customerFranchisees;
    @XmlElement(required = true)
    protected String updateUserId;
    @XmlElement(required = true)
    protected String securityUserId;

    /**
     * Gets the value of the customerFranchisees property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFranchiseeRequestType }
     *     
     */
    public CustomerFranchiseeRequestType getCustomerFranchisees() {
        return customerFranchisees;
    }

    /**
     * Sets the value of the customerFranchisees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFranchiseeRequestType }
     *     
     */
    public void setCustomerFranchisees(CustomerFranchiseeRequestType value) {
        this.customerFranchisees = value;
    }

    /**
     * Gets the value of the updateUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * Sets the value of the updateUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUserId(String value) {
        this.updateUserId = value;
    }

    /**
     * Gets the value of the securityUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityUserId() {
        return securityUserId;
    }

    /**
     * Sets the value of the securityUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityUserId(String value) {
        this.securityUserId = value;
    }

}
