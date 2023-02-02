
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInformationLookupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationLookupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://v3_1.customer.webservices.csx.dtv.com/}AddressLookupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://v3_1.customer.webservices.csx.dtv.com/}EMailLookupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://v3_1.customer.webservices.csx.dtv.com/}TelephoneLookupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationLookupType", propOrder = {
    "address",
    "eMail",
    "telephone"
})
public class ContactInformationLookupType {

    @XmlElement(name = "Address")
    protected List<AddressLookupType> address;
    @XmlElement(name = "EMail")
    protected List<EMailLookupType> eMail;
    @XmlElement(name = "Telephone")
    protected List<TelephoneLookupType> telephone;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLookupType }
     * 
     * 
     */
    public List<AddressLookupType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressLookupType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMailLookupType }
     * 
     * 
     */
    public List<EMailLookupType> getEMail() {
        if (eMail == null) {
            eMail = new ArrayList<EMailLookupType>();
        }
        return this.eMail;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneLookupType }
     * 
     * 
     */
    public List<TelephoneLookupType> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<TelephoneLookupType>();
        }
        return this.telephone;
    }

}
