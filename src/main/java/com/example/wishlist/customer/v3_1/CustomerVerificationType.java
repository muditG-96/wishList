
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerVerificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonalID" type="{http://v3_1.customer.webservices.csx.dtv.com/}PersonalIDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerVerificationType", propOrder = {
    "personalID"
})
public class CustomerVerificationType {

    @XmlElement(name = "PersonalID", required = true)
    protected PersonalIDType personalID;

    /**
     * Gets the value of the personalID property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalIDType }
     *     
     */
    public PersonalIDType getPersonalID() {
        return personalID;
    }

    /**
     * Sets the value of the personalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalIDType }
     *     
     */
    public void setPersonalID(PersonalIDType value) {
        this.personalID = value;
    }

}
