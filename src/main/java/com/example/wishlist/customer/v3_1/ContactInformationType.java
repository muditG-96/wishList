
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://v3_1.customer.webservices.csx.dtv.com/}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://v3_1.customer.webservices.csx.dtv.com/}EMailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://v3_1.customer.webservices.csx.dtv.com/}TelephoneType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationType", propOrder = {
    "address",
    "eMail",
    "telephone"
})
public class ContactInformationType {

    @XmlElement(name = "Address")
    protected List<AddressType> address;
    @XmlElement(name = "EMail")
    protected List<EMailType> eMail;
    @XmlElement(name = "Telephone")
    protected List<TelephoneType> telephone;

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
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
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
     * {@link EMailType }
     * 
     * 
     */
    public List<EMailType> getEMail() {
        if (eMail == null) {
            eMail = new ArrayList<EMailType>();
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
     * {@link TelephoneType }
     * 
     * 
     */
    public List<TelephoneType> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<TelephoneType>();
        }
        return this.telephone;
    }

}
