
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergeCustomers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergeCustomers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mergeSource" type="{http://v3_1.customer.webservices.csx.dtv.com/}custIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="mergeTargetSet" type="{http://v3_1.customer.webservices.csx.dtv.com/}custIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="updateUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "mergeCustomers", propOrder = {
    "mergeSource",
    "mergeTargetSet",
    "updateUserId",
    "securityUserId"
})
public class MergeCustomers {

    protected CustIdentifier mergeSource;
    protected List<CustIdentifier> mergeTargetSet;
    protected String updateUserId;
    protected String securityUserId;

    /**
     * Gets the value of the mergeSource property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdentifier }
     *     
     */
    public CustIdentifier getMergeSource() {
        return mergeSource;
    }

    /**
     * Sets the value of the mergeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdentifier }
     *     
     */
    public void setMergeSource(CustIdentifier value) {
        this.mergeSource = value;
    }

    /**
     * Gets the value of the mergeTargetSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mergeTargetSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMergeTargetSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustIdentifier }
     * 
     * 
     */
    public List<CustIdentifier> getMergeTargetSet() {
        if (mergeTargetSet == null) {
            mergeTargetSet = new ArrayList<CustIdentifier>();
        }
        return this.mergeTargetSet;
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
