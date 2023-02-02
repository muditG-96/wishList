
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInformationReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://v3_1.customer.webservices.csx.dtv.com/}AddressReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://v3_1.customer.webservices.csx.dtv.com/}EMailReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://v3_1.customer.webservices.csx.dtv.com/}TelephoneReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationReturnType", propOrder = {
    "address",
    "eMail",
    "telephone"
})
public class ContactInformationReturnType {

    @XmlElement(name = "Address")
    protected List<AddressReturnType> address;
    @XmlElement(name = "EMail")
    protected List<EMailReturnType> eMail;
    @XmlElement(name = "Telephone")
    protected List<TelephoneReturnType> telephone;

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
     * {@link AddressReturnType }
     * 
     * 
     */
    public List<AddressReturnType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressReturnType>();
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
     * {@link EMailReturnType }
     * 
     * 
     */
    public List<EMailReturnType> getEMail() {
        if (eMail == null) {
            eMail = new ArrayList<EMailReturnType>();
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
     * {@link TelephoneReturnType }
     * 
     * 
     */
    public List<TelephoneReturnType> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<TelephoneReturnType>();
        }
        return this.telephone;
    }

}
