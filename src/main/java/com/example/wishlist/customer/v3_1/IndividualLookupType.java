
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualLookupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualLookupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerNameLookupType"/&gt;
 *         &lt;element name="ContactInformation" type="{http://v3_1.customer.webservices.csx.dtv.com/}ContactInformationLookupType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualLookupType", propOrder = {
    "name",
    "contactInformation"
})
public class IndividualLookupType {

    @XmlElement(name = "Name", required = true)
    protected CustomerNameLookupType name;
    @XmlElement(name = "ContactInformation", required = true)
    protected ContactInformationLookupType contactInformation;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameLookupType }
     *     
     */
    public CustomerNameLookupType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameLookupType }
     *     
     */
    public void setName(CustomerNameLookupType value) {
        this.name = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationLookupType }
     *     
     */
    public ContactInformationLookupType getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationLookupType }
     *     
     */
    public void setContactInformation(ContactInformationLookupType value) {
        this.contactInformation = value;
    }

}
