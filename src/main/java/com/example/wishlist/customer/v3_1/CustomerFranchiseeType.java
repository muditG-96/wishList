
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CustomerFranchiseeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFranchiseeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="action" type="{http://v3_1.customer.webservices.csx.dtv.com/}FranchiseeActionType" /&gt;
 *       &lt;attribute name="franchiseeId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="franchiseeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFranchiseeType", propOrder = {
    "value"
})
public class CustomerFranchiseeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "action")
    protected FranchiseeActionType action;
    @XmlAttribute(name = "franchiseeId")
    protected String franchiseeId;
    @XmlAttribute(name = "franchiseeName")
    protected String franchiseeName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link FranchiseeActionType }
     *     
     */
    public FranchiseeActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link FranchiseeActionType }
     *     
     */
    public void setAction(FranchiseeActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the franchiseeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchiseeId() {
        return franchiseeId;
    }

    /**
     * Sets the value of the franchiseeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchiseeId(String value) {
        this.franchiseeId = value;
    }

    /**
     * Gets the value of the franchiseeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchiseeName() {
        return franchiseeName;
    }

    /**
     * Sets the value of the franchiseeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchiseeName(String value) {
        this.franchiseeName = value;
    }

}
