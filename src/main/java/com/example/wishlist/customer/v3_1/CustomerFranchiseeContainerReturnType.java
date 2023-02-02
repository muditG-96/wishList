
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFranchiseeContainerReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFranchiseeContainerReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Franchisee" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerFranchiseeReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFranchiseeContainerReturnType", propOrder = {
    "franchisee"
})
public class CustomerFranchiseeContainerReturnType {

    @XmlElement(name = "Franchisee")
    protected List<CustomerFranchiseeReturnType> franchisee;

    /**
     * Gets the value of the franchisee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the franchisee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFranchisee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerFranchiseeReturnType }
     * 
     * 
     */
    public List<CustomerFranchiseeReturnType> getFranchisee() {
        if (franchisee == null) {
            franchisee = new ArrayList<CustomerFranchiseeReturnType>();
        }
        return this.franchisee;
    }

}
