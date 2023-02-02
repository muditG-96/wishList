
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferenceCenterReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceCenterReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preferenceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PreferenceCenterChannel" type="{http://v3_1.customer.webservices.csx.dtv.com/}PreferenceCenterChannelReqType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferenceCenterReqType", propOrder = {
    "action",
    "preferenceTypeId",
    "preferenceCenterChannel"
})
public class PreferenceCenterReqType {

    @XmlElement(name = "Action", required = true)
    protected String action;
    protected long preferenceTypeId;
    @XmlElement(name = "PreferenceCenterChannel")
    protected List<PreferenceCenterChannelReqType> preferenceCenterChannel;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the preferenceTypeId property.
     * 
     */
    public long getPreferenceTypeId() {
        return preferenceTypeId;
    }

    /**
     * Sets the value of the preferenceTypeId property.
     * 
     */
    public void setPreferenceTypeId(long value) {
        this.preferenceTypeId = value;
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
     * {@link PreferenceCenterChannelReqType }
     * 
     * 
     */
    public List<PreferenceCenterChannelReqType> getPreferenceCenterChannel() {
        if (preferenceCenterChannel == null) {
            preferenceCenterChannel = new ArrayList<PreferenceCenterChannelReqType>();
        }
        return this.preferenceCenterChannel;
    }

}
