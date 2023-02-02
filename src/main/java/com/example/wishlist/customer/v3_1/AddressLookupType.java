
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressLookupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressLookupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressLine1" type="{http://v3_1.customer.webservices.csx.dtv.com/}AddressLineLookupType"/&gt;
 *         &lt;element name="AddressLine2" type="{http://v3_1.customer.webservices.csx.dtv.com/}AddressLineLookupType"/&gt;
 *         &lt;element name="AddressLine3" type="{http://v3_1.customer.webservices.csx.dtv.com/}AddressLineLookupType"/&gt;
 *         &lt;element name="AddressLine4" type="{http://v3_1.customer.webservices.csx.dtv.com/}AddressLineLookupType"/&gt;
 *         &lt;element name="City" type="{http://v3_1.customer.webservices.csx.dtv.com/}AddressLineLookupType"/&gt;
 *         &lt;element name="Territory" type="{http://v3_1.customer.webservices.csx.dtv.com/}TerritoryLookupType"/&gt;
 *         &lt;element name="PostalCode" type="{http://v3_1.customer.webservices.csx.dtv.com/}PostalCodeLookupType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressLookupType", propOrder = {
    "country",
    "county",
    "apartmentNumber",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "city",
    "territory",
    "postalCode"
})
public class AddressLookupType {

    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "ApartmentNumber", required = true)
    protected String apartmentNumber;
    @XmlElement(name = "AddressLine1", required = true)
    protected AddressLineLookupType addressLine1;
    @XmlElement(name = "AddressLine2", required = true)
    protected AddressLineLookupType addressLine2;
    @XmlElement(name = "AddressLine3", required = true)
    protected AddressLineLookupType addressLine3;
    @XmlElement(name = "AddressLine4", required = true)
    protected AddressLineLookupType addressLine4;
    @XmlElement(name = "City", required = true)
    protected AddressLineLookupType city;
    @XmlElement(name = "Territory", required = true)
    protected TerritoryLookupType territory;
    @XmlElement(name = "PostalCode", required = true)
    protected PostalCodeLookupType postalCode;
    @XmlAttribute(name = "TypeCode")
    protected String typeCode;
    @XmlAttribute(name = "SequenceNumber")
    protected String sequenceNumber;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLineLookupType }
     *     
     */
    public AddressLineLookupType getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLineLookupType }
     *     
     */
    public void setAddressLine1(AddressLineLookupType value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLineLookupType }
     *     
     */
    public AddressLineLookupType getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLineLookupType }
     *     
     */
    public void setAddressLine2(AddressLineLookupType value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLineLookupType }
     *     
     */
    public AddressLineLookupType getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLineLookupType }
     *     
     */
    public void setAddressLine3(AddressLineLookupType value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLineLookupType }
     *     
     */
    public AddressLineLookupType getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLineLookupType }
     *     
     */
    public void setAddressLine4(AddressLineLookupType value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLineLookupType }
     *     
     */
    public AddressLineLookupType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLineLookupType }
     *     
     */
    public void setCity(AddressLineLookupType value) {
        this.city = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link TerritoryLookupType }
     *     
     */
    public TerritoryLookupType getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerritoryLookupType }
     *     
     */
    public void setTerritory(TerritoryLookupType value) {
        this.territory = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeLookupType }
     *     
     */
    public PostalCodeLookupType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeLookupType }
     *     
     */
    public void setPostalCode(PostalCodeLookupType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

}
