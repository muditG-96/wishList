
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerLookupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerLookupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Instrument" type="{http://v3_1.customer.webservices.csx.dtv.com/}InstrumentLookupType"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EntityInformation" type="{http://v3_1.customer.webservices.csx.dtv.com/}EntityInformationLookupType"/&gt;
 *         &lt;element name="AlternateKey" type="{http://v3_1.customer.webservices.csx.dtv.com/}AlterKeyLookupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerLookupType", propOrder = {
    "instrument",
    "customerID",
    "businessName",
    "entityInformation",
    "alternateKey",
    "segmentID"
})
public class CustomerLookupType {

    @XmlElement(name = "Instrument", required = true)
    protected InstrumentLookupType instrument;
    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "BusinessName", required = true)
    protected String businessName;
    @XmlElement(name = "EntityInformation", required = true)
    protected EntityInformationLookupType entityInformation;
    @XmlElement(name = "AlternateKey")
    protected List<AlterKeyLookupType> alternateKey;
    @XmlElement(name = "SegmentID", required = true)
    protected String segmentID;

    /**
     * Gets the value of the instrument property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentLookupType }
     *     
     */
    public InstrumentLookupType getInstrument() {
        return instrument;
    }

    /**
     * Sets the value of the instrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentLookupType }
     *     
     */
    public void setInstrument(InstrumentLookupType value) {
        this.instrument = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the entityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityInformationLookupType }
     *     
     */
    public EntityInformationLookupType getEntityInformation() {
        return entityInformation;
    }

    /**
     * Sets the value of the entityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityInformationLookupType }
     *     
     */
    public void setEntityInformation(EntityInformationLookupType value) {
        this.entityInformation = value;
    }

    /**
     * Gets the value of the alternateKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlterKeyLookupType }
     * 
     * 
     */
    public List<AlterKeyLookupType> getAlternateKey() {
        if (alternateKey == null) {
            alternateKey = new ArrayList<AlterKeyLookupType>();
        }
        return this.alternateKey;
    }

    /**
     * Gets the value of the segmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentID() {
        return segmentID;
    }

    /**
     * Sets the value of the segmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentID(String value) {
        this.segmentID = value;
    }

}
