
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferenceCenterContainerRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceCenterContainerRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreferenceCenter" type="{http://v3_1.customer.webservices.csx.dtv.com/}PreferenceCenterReqType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferenceCenterContainerRequestType", propOrder = {
    "preferenceCenter"
})
public class PreferenceCenterContainerRequestType {

    @XmlElement(name = "PreferenceCenter", required = true)
    protected List<PreferenceCenterReqType> preferenceCenter;

    /**
     * Gets the value of the preferenceCenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferenceCenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferenceCenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferenceCenterReqType }
     * 
     * 
     */
    public List<PreferenceCenterReqType> getPreferenceCenter() {
        if (preferenceCenter == null) {
            preferenceCenter = new ArrayList<PreferenceCenterReqType>();
        }
        return this.preferenceCenter;
    }

}
