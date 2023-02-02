
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferenceCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceCenterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preferenceTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preferenceTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PreferenceCenterChannel" type="{http://v3_1.customer.webservices.csx.dtv.com/}PreferenceCenterChannelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferenceCenterType", propOrder = {
    "preferenceTypeId",
    "preferenceTypeName",
    "preferenceCenterChannel"
})
public class PreferenceCenterType {

    @XmlElement(required = true)
    protected String preferenceTypeId;
    @XmlElement(required = true)
    protected String preferenceTypeName;
    @XmlElement(name = "PreferenceCenterChannel")
    protected List<PreferenceCenterChannelType> preferenceCenterChannel;

    /**
     * Gets the value of the preferenceTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceTypeId() {
        return preferenceTypeId;
    }

    /**
     * Sets the value of the preferenceTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceTypeId(String value) {
        this.preferenceTypeId = value;
    }

    /**
     * Gets the value of the preferenceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceTypeName() {
        return preferenceTypeName;
    }

    /**
     * Sets the value of the preferenceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceTypeName(String value) {
        this.preferenceTypeName = value;
    }

    /**
     * Gets the value of the preferenceCenterChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferenceCenterChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferenceCenterChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferenceCenterChannelType }
     * 
     * 
     */
    public List<PreferenceCenterChannelType> getPreferenceCenterChannel() {
        if (preferenceCenterChannel == null) {
            preferenceCenterChannel = new ArrayList<PreferenceCenterChannelType>();
        }
        return this.preferenceCenterChannel;
    }

}
