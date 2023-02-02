
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetailStoreID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Instrument" type="{http://v3_1.customer.webservices.csx.dtv.com/}InstrumentType"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustOrgTypcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Prospect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerOwnerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastUpdateInfo" type="{http://v3_1.customer.webservices.csx.dtv.com/}LastUpdateInfoType"/&gt;
 *         &lt;element name="Affiliation" type="{http://v3_1.customer.webservices.csx.dtv.com/}AffiliationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EntityInformation" type="{http://v3_1.customer.webservices.csx.dtv.com/}EntityInformationType"/&gt;
 *         &lt;element name="PersonalPreferences" type="{http://v3_1.customer.webservices.csx.dtv.com/}PersonalPreferencesType"/&gt;
 *         &lt;element name="AlternateKey" type="{http://v3_1.customer.webservices.csx.dtv.com/}AlternateKeyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomAttribute" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomAttributeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerNotes" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerNotesContainerType" minOccurs="0"/&gt;
 *         &lt;element name="SignupDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AssociateAssignments" type="{http://v3_1.customer.webservices.csx.dtv.com/}AssociateAssignmentsContainerType" minOccurs="0"/&gt;
 *         &lt;element name="PreferenceCenters" type="{http://v3_1.customer.webservices.csx.dtv.com/}PreferenceCenterContainerRequestType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "retailStoreID",
    "instrument",
    "customerID",
    "orgName",
    "custOrgTypcode",
    "employeeID",
    "businessName",
    "customerClass",
    "source",
    "prospect",
    "customerOwnerID",
    "customerNumber",
    "customerReference",
    "lastUpdateInfo",
    "affiliation",
    "entityInformation",
    "personalPreferences",
    "alternateKey",
    "customAttribute",
    "customerNotes",
    "signupDate",
    "associateAssignments",
    "preferenceCenters"
})
public class CustomerType {

    @XmlElement(name = "RetailStoreID", required = true)
    protected String retailStoreID;
    @XmlElement(name = "Instrument", required = true)
    protected InstrumentType instrument;
    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "OrgName", required = true)
    protected String orgName;
    @XmlElement(name = "CustOrgTypcode", required = true)
    protected String custOrgTypcode;
    @XmlElement(name = "EmployeeID", required = true)
    protected String employeeID;
    @XmlElement(name = "BusinessName", required = true)
    protected String businessName;
    @XmlElement(name = "CustomerClass", required = true)
    protected String customerClass;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "Prospect")
    protected Boolean prospect;
    @XmlElement(name = "CustomerOwnerID", required = true)
    protected String customerOwnerID;
    @XmlElement(name = "CustomerNumber", required = true)
    protected String customerNumber;
    @XmlElement(name = "CustomerReference", required = true)
    protected String customerReference;
    @XmlElement(name = "LastUpdateInfo", required = true)
    protected LastUpdateInfoType lastUpdateInfo;
    @XmlElement(name = "Affiliation")
    protected List<AffiliationType> affiliation;
    @XmlElement(name = "EntityInformation", required = true)
    protected EntityInformationType entityInformation;
    @XmlElement(name = "PersonalPreferences", required = true)
    protected PersonalPreferencesType personalPreferences;
    @XmlElement(name = "AlternateKey")
    protected List<AlternateKeyType> alternateKey;
    @XmlElement(name = "CustomAttribute")
    protected List<CustomAttributeType> customAttribute;
    @XmlElement(name = "CustomerNotes")
    protected CustomerNotesContainerType customerNotes;
    @XmlElement(name = "SignupDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signupDate;
    @XmlElement(name = "AssociateAssignments")
    protected AssociateAssignmentsContainerType associateAssignments;
    @XmlElement(name = "PreferenceCenters")
    protected PreferenceCenterContainerRequestType preferenceCenters;

    /**
     * Gets the value of the retailStoreID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailStoreID() {
        return retailStoreID;
    }

    /**
     * Sets the value of the retailStoreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailStoreID(String value) {
        this.retailStoreID = value;
    }

    /**
     * Gets the value of the instrument property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentType }
     *     
     */
    public InstrumentType getInstrument() {
        return instrument;
    }

    /**
     * Sets the value of the instrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentType }
     *     
     */
    public void setInstrument(InstrumentType value) {
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
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the custOrgTypcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustOrgTypcode() {
        return custOrgTypcode;
    }

    /**
     * Sets the value of the custOrgTypcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustOrgTypcode(String value) {
        this.custOrgTypcode = value;
    }

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeID(String value) {
        this.employeeID = value;
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
     * Gets the value of the customerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerClass() {
        return customerClass;
    }

    /**
     * Sets the value of the customerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerClass(String value) {
        this.customerClass = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the prospect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProspect() {
        return prospect;
    }

    /**
     * Sets the value of the prospect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProspect(Boolean value) {
        this.prospect = value;
    }

    /**
     * Gets the value of the customerOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOwnerID() {
        return customerOwnerID;
    }

    /**
     * Sets the value of the customerOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOwnerID(String value) {
        this.customerOwnerID = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the lastUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LastUpdateInfoType }
     *     
     */
    public LastUpdateInfoType getLastUpdateInfo() {
        return lastUpdateInfo;
    }

    /**
     * Sets the value of the lastUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastUpdateInfoType }
     *     
     */
    public void setLastUpdateInfo(LastUpdateInfoType value) {
        this.lastUpdateInfo = value;
    }

    /**
     * Gets the value of the affiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffiliationType }
     * 
     * 
     */
    public List<AffiliationType> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<AffiliationType>();
        }
        return this.affiliation;
    }

    /**
     * Gets the value of the entityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityInformationType }
     *     
     */
    public EntityInformationType getEntityInformation() {
        return entityInformation;
    }

    /**
     * Sets the value of the entityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityInformationType }
     *     
     */
    public void setEntityInformation(EntityInformationType value) {
        this.entityInformation = value;
    }

    /**
     * Gets the value of the personalPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalPreferencesType }
     *     
     */
    public PersonalPreferencesType getPersonalPreferences() {
        return personalPreferences;
    }

    /**
     * Sets the value of the personalPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalPreferencesType }
     *     
     */
    public void setPersonalPreferences(PersonalPreferencesType value) {
        this.personalPreferences = value;
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
     * {@link AlternateKeyType }
     * 
     * 
     */
    public List<AlternateKeyType> getAlternateKey() {
        if (alternateKey == null) {
            alternateKey = new ArrayList<AlternateKeyType>();
        }
        return this.alternateKey;
    }

    /**
     * Gets the value of the customAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomAttributeType }
     * 
     * 
     */
    public List<CustomAttributeType> getCustomAttribute() {
        if (customAttribute == null) {
            customAttribute = new ArrayList<CustomAttributeType>();
        }
        return this.customAttribute;
    }

    /**
     * Gets the value of the customerNotes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNotesContainerType }
     *     
     */
    public CustomerNotesContainerType getCustomerNotes() {
        return customerNotes;
    }

    /**
     * Sets the value of the customerNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNotesContainerType }
     *     
     */
    public void setCustomerNotes(CustomerNotesContainerType value) {
        this.customerNotes = value;
    }

    /**
     * Gets the value of the signupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignupDate() {
        return signupDate;
    }

    /**
     * Sets the value of the signupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignupDate(XMLGregorianCalendar value) {
        this.signupDate = value;
    }

    /**
     * Gets the value of the associateAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link AssociateAssignmentsContainerType }
     *     
     */
    public AssociateAssignmentsContainerType getAssociateAssignments() {
        return associateAssignments;
    }

    /**
     * Sets the value of the associateAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociateAssignmentsContainerType }
     *     
     */
    public void setAssociateAssignments(AssociateAssignmentsContainerType value) {
        this.associateAssignments = value;
    }

    /**
     * Gets the value of the preferenceCenters property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceCenterContainerRequestType }
     *     
     */
    public PreferenceCenterContainerRequestType getPreferenceCenters() {
        return preferenceCenters;
    }

    /**
     * Sets the value of the preferenceCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceCenterContainerRequestType }
     *     
     */
    public void setPreferenceCenters(PreferenceCenterContainerRequestType value) {
        this.preferenceCenters = value;
    }

}
