
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFranchiseeContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFranchiseeContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerFranchisee" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerFranchiseeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFranchiseeContainerType", propOrder = {
    "customerFranchisee"
})
public class CustomerFranchiseeContainerType {

    @XmlElement(name = "CustomerFranchisee")
    protected List<CustomerFranchiseeType> customerFranchisee;

    /**
     * Gets the value of the customerFranchisee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerFranchisee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerFranchisee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerFranchiseeType }
     * 
     * 
     */
    public List<CustomerFranchiseeType> getCustomerFranchisee() {
        if (customerFranchisee == null) {
            customerFranchisee = new ArrayList<CustomerFranchiseeType>();
        }
        return this.customerFranchisee;
    }

}
