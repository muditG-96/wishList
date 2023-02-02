
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeItemDisplayStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeItemDisplayStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="visualizerItems" type="{http://v3_1.customer.webservices.csx.dtv.com/}ItemVisualizerRequestType" minOccurs="0"/&gt;
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
@XmlType(name = "changeItemDisplayStatus", propOrder = {
    "visualizerItems",
    "updateUserId",
    "securityUserId"
})
public class ChangeItemDisplayStatus {

    protected ItemVisualizerRequestType visualizerItems;
    protected String updateUserId;
    protected String securityUserId;

    /**
     * Gets the value of the visualizerItems property.
     * 
     * @return
     *     possible object is
     *     {@link ItemVisualizerRequestType }
     *     
     */
    public ItemVisualizerRequestType getVisualizerItems() {
        return visualizerItems;
    }

    /**
     * Sets the value of the visualizerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemVisualizerRequestType }
     *     
     */
    public void setVisualizerItems(ItemVisualizerRequestType value) {
        this.visualizerItems = value;
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
