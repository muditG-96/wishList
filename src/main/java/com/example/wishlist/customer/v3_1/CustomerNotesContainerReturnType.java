
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerNotesContainerReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerNotesContainerReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerNote" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerNotesReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerNotesContainerReturnType", propOrder = {
    "customerNote",
    "securityPrivilege",
    "maskData"
})
public class CustomerNotesContainerReturnType {

    @XmlElement(name = "CustomerNote")
    protected List<CustomerNotesReturnType> customerNote;
    @XmlElement(name = "SecurityPrivilege")
    protected String securityPrivilege;
    @XmlElement(name = "MaskData")
    protected boolean maskData;

    /**
     * Gets the value of the customerNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerNotesReturnType }
     * 
     * 
     */
    public List<CustomerNotesReturnType> getCustomerNote() {
        if (customerNote == null) {
            customerNote = new ArrayList<CustomerNotesReturnType>();
        }
        return this.customerNote;
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
