
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateAssociateAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAssociateAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associateAssignmentData" type="{http://v3_1.customer.webservices.csx.dtv.com/}AssociateAssignmentRequestType" minOccurs="0"/&gt;
 *         &lt;element name="securityUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAssociateAssignment", propOrder = {
    "associateAssignmentData",
    "securityUserId"
})
public class UpdateAssociateAssignment {

    protected AssociateAssignmentRequestType associateAssignmentData;
    protected String securityUserId;

    /**
     * Gets the value of the associateAssignmentData property.
     * 
     * @return
     *     possible object is
     *     {@link AssociateAssignmentRequestType }
     *     
     */
    public AssociateAssignmentRequestType getAssociateAssignmentData() {
        return associateAssignmentData;
    }

    /**
     * Sets the value of the associateAssignmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociateAssignmentRequestType }
     *     
     */
    public void setAssociateAssignmentData(AssociateAssignmentRequestType value) {
        this.associateAssignmentData = value;
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
