
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SignupDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaultDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetailStoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LastPurchaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Validation" type="{http://v3_1.customer.webservices.csx.dtv.com/}ValidationType" minOccurs="0"/&gt;
 *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustOrgTypcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prospect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CustomerOwnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HouseholdKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateInfo" type="{http://v3_1.customer.webservices.csx.dtv.com/}LastUpdateInfoReturnType" minOccurs="0"/&gt;
 *         &lt;element name="Affiliation" type="{http://v3_1.customer.webservices.csx.dtv.com/}AffiliationReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EntityInformation" type="{http://v3_1.customer.webservices.csx.dtv.com/}EntityInformationReturnType" minOccurs="0"/&gt;
 *         &lt;element name="PersonalPreferences" type="{http://v3_1.customer.webservices.csx.dtv.com/}PersonalPreferencesReturnType" minOccurs="0"/&gt;
 *         &lt;element name="AlternateKey" type="{http://v3_1.customer.webservices.csx.dtv.com/}AlternateKeyReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomAttribute" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomAttributeReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerNotes" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerNotesContainerReturnType" minOccurs="0"/&gt;
 *         &lt;element name="EligiblePromotionDeals" type="{http://v3_1.customer.webservices.csx.dtv.com/}EligiblePromotionDealsType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSegments" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerSegmentsType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerCards" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerCardsType" minOccurs="0"/&gt;
 *         &lt;element name="MaskData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AssociateAssignments" type="{http://v3_1.customer.webservices.csx.dtv.com/}AssociateAssignmentContainerReturnType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SystemCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreferenceCenters" type="{http://v3_1.customer.webservices.csx.dtv.com/}PreferenceCenterContainerReturnType" minOccurs="0"/&gt;
 *         &lt;element name="Franchisees" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerFranchiseeContainerReturnType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerResponseType", propOrder = {
    "customerID",
    "signupDate",
    "responseDescription",
    "faultDetail",
    "errorCode",
    "retailStoreID",
    "firstPurchaseDate",
    "lastPurchaseDate",
    "validation",
    "orgName",
    "custOrgTypcode",
    "employeeID",
    "businessName",
    "customerClass",
    "source",
    "prospect",
    "customerOwnerID",
    "householdKey",
    "customerNumber",
    "customerReference",
    "lastUpdateInfo",
    "affiliation",
    "entityInformation",
    "personalPreferences",
    "alternateKey",
    "customAttribute",
    "customerNotes",
    "eligiblePromotionDeals",
    "customerSegments",
    "customerCards",
    "maskData",
    "associateAssignments",
    "securityPrivilege",
    "systemCurrencyCode",
    "requestedCurrencyCode",
    "preferenceCenters",
    "franchisees"
})
public class CustomerResponseType {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "SignupDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signupDate;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "FaultDetail")
    protected String faultDetail;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "RetailStoreID")
    protected String retailStoreID;
    @XmlElement(name = "FirstPurchaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPurchaseDate;
    @XmlElement(name = "LastPurchaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPurchaseDate;
    @XmlElement(name = "Validation")
    protected ValidationType validation;
    @XmlElement(name = "OrgName")
    protected String orgName;
    @XmlElement(name = "CustOrgTypcode")
    protected String custOrgTypcode;
    @XmlElement(name = "EmployeeID")
    protected String employeeID;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "CustomerClass")
    protected String customerClass;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Prospect")
    protected Boolean prospect;
    @XmlElement(name = "CustomerOwnerID")
    protected String customerOwnerID;
    @XmlElement(name = "HouseholdKey")
    protected String householdKey;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "CustomerReference")
    protected String customerReference;
    @XmlElement(name = "LastUpdateInfo")
    protected LastUpdateInfoReturnType lastUpdateInfo;
    @XmlElement(name = "Affiliation")
    protected List<AffiliationReturnType> affiliation;
    @XmlElement(name = "EntityInformation")
    protected EntityInformationReturnType entityInformation;
    @XmlElement(name = "PersonalPreferences")
    protected PersonalPreferencesReturnType personalPreferences;
    @XmlElement(name = "AlternateKey")
    protected List<AlternateKeyReturnType> alternateKey;
    @XmlElement(name = "CustomAttribute")
    protected List<CustomAttributeReturnType> customAttribute;
    @XmlElement(name = "CustomerNotes")
    protected CustomerNotesContainerReturnType customerNotes;
    @XmlElement(name = "EligiblePromotionDeals")
    protected EligiblePromotionDealsType eligiblePromotionDeals;
    @XmlElement(name = "CustomerSegments")
    protected CustomerSegmentsType customerSegments;
    @XmlElement(name = "CustomerCards")
    protected CustomerCardsType customerCards;
    @XmlElement(name = "MaskData")
    protected boolean maskData;
    @XmlElement(name = "AssociateAssignments")
    protected AssociateAssignmentContainerReturnType associateAssignments;
    @XmlElement(name = "SecurityPrivilege")
    protected String securityPrivilege;
    @XmlElement(name = "SystemCurrencyCode")
    protected String systemCurrencyCode;
    @XmlElement(name = "RequestedCurrencyCode")
    protected String requestedCurrencyCode;
    @XmlElement(name = "PreferenceCenters")
    protected PreferenceCenterContainerReturnType preferenceCenters;
    @XmlElement(name = "Franchisees")
    protected CustomerFranchiseeContainerReturnType franchisees;
    @XmlAttribute(name = "ResponseCode")
    protected String responseCode;

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
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
    }

    /**
     * Gets the value of the faultDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultDetail() {
        return faultDetail;
    }

    /**
     * Sets the value of the faultDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultDetail(String value) {
        this.faultDetail = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

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
     * Gets the value of the firstPurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPurchaseDate() {
        return firstPurchaseDate;
    }

    /**
     * Sets the value of the firstPurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPurchaseDate(XMLGregorianCalendar value) {
        this.firstPurchaseDate = value;
    }

    /**
     * Gets the value of the lastPurchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    /**
     * Sets the value of the lastPurchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPurchaseDate(XMLGregorianCalendar value) {
        this.lastPurchaseDate = value;
    }

    /**
     * Gets the value of the validation property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationType }
     *     
     */
    public ValidationType getValidation() {
        return validation;
    }

    /**
     * Sets the value of the validation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationType }
     *     
     */
    public void setValidation(ValidationType value) {
        this.validation = value;
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
     * Gets the value of the householdKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdKey() {
        return householdKey;
    }

    /**
     * Sets the value of the householdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdKey(String value) {
        this.householdKey = value;
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
     *     {@link LastUpdateInfoReturnType }
     *     
     */
    public LastUpdateInfoReturnType getLastUpdateInfo() {
        return lastUpdateInfo;
    }

    /**
     * Sets the value of the lastUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastUpdateInfoReturnType }
     *     
     */
    public void setLastUpdateInfo(LastUpdateInfoReturnType value) {
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
     * {@link AffiliationReturnType }
     * 
     * 
     */
    public List<AffiliationReturnType> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<AffiliationReturnType>();
        }
        return this.affiliation;
    }

    /**
     * Gets the value of the entityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityInformationReturnType }
     *     
     */
    public EntityInformationReturnType getEntityInformation() {
        return entityInformation;
    }

    /**
     * Sets the value of the entityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityInformationReturnType }
     *     
     */
    public void setEntityInformation(EntityInformationReturnType value) {
        this.entityInformation = value;
    }

    /**
     * Gets the value of the personalPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalPreferencesReturnType }
     *     
     */
    public PersonalPreferencesReturnType getPersonalPreferences() {
        return personalPreferences;
    }

    /**
     * Sets the value of the personalPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalPreferencesReturnType }
     *     
     */
    public void setPersonalPreferences(PersonalPreferencesReturnType value) {
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
     * {@link AlternateKeyReturnType }
     * 
     * 
     */
    public List<AlternateKeyReturnType> getAlternateKey() {
        if (alternateKey == null) {
            alternateKey = new ArrayList<AlternateKeyReturnType>();
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
     * {@link CustomAttributeReturnType }
     * 
     * 
     */
    public List<CustomAttributeReturnType> getCustomAttribute() {
        if (customAttribute == null) {
            customAttribute = new ArrayList<CustomAttributeReturnType>();
        }
        return this.customAttribute;
    }

    /**
     * Gets the value of the customerNotes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNotesContainerReturnType }
     *     
     */
    public CustomerNotesContainerReturnType getCustomerNotes() {
        return customerNotes;
    }

    /**
     * Sets the value of the customerNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNotesContainerReturnType }
     *     
     */
    public void setCustomerNotes(CustomerNotesContainerReturnType value) {
        this.customerNotes = value;
    }

    /**
     * Gets the value of the eligiblePromotionDeals property.
     * 
     * @return
     *     possible object is
     *     {@link EligiblePromotionDealsType }
     *     
     */
    public EligiblePromotionDealsType getEligiblePromotionDeals() {
        return eligiblePromotionDeals;
    }

    /**
     * Sets the value of the eligiblePromotionDeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePromotionDealsType }
     *     
     */
    public void setEligiblePromotionDeals(EligiblePromotionDealsType value) {
        this.eligiblePromotionDeals = value;
    }

    /**
     * Gets the value of the customerSegments property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSegmentsType }
     *     
     */
    public CustomerSegmentsType getCustomerSegments() {
        return customerSegments;
    }

    /**
     * Sets the value of the customerSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSegmentsType }
     *     
     */
    public void setCustomerSegments(CustomerSegmentsType value) {
        this.customerSegments = value;
    }

    /**
     * Gets the value of the customerCards property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCardsType }
     *     
     */
    public CustomerCardsType getCustomerCards() {
        return customerCards;
    }

    /**
     * Sets the value of the customerCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCardsType }
     *     
     */
    public void setCustomerCards(CustomerCardsType value) {
        this.customerCards = value;
    }

    /**
     * Gets the value of the maskData property.
     * 
     */
    public boolean isMaskData() {
        return maskData;
    }

    /**
     * Sets the value of the maskData property.
     * 
     */
    public void setMaskData(boolean value) {
        this.maskData = value;
    }

    /**
     * Gets the value of the associateAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link AssociateAssignmentContainerReturnType }
     *     
     */
    public AssociateAssignmentContainerReturnType getAssociateAssignments() {
        return associateAssignments;
    }

    /**
     * Sets the value of the associateAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociateAssignmentContainerReturnType }
     *     
     */
    public void setAssociateAssignments(AssociateAssignmentContainerReturnType value) {
        this.associateAssignments = value;
    }

    /**
     * Gets the value of the securityPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPrivilege() {
        return securityPrivilege;
    }

    /**
     * Sets the value of the securityPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPrivilege(String value) {
        this.securityPrivilege = value;
    }

    /**
     * Gets the value of the systemCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCurrencyCode() {
        return systemCurrencyCode;
    }

    /**
     * Sets the value of the systemCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCurrencyCode(String value) {
        this.systemCurrencyCode = value;
    }

    /**
     * Gets the value of the requestedCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCurrencyCode() {
        return requestedCurrencyCode;
    }

    /**
     * Sets the value of the requestedCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCurrencyCode(String value) {
        this.requestedCurrencyCode = value;
    }

    /**
     * Gets the value of the preferenceCenters property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceCenterContainerReturnType }
     *     
     */
    public PreferenceCenterContainerReturnType getPreferenceCenters() {
        return preferenceCenters;
    }

    /**
     * Sets the value of the preferenceCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceCenterContainerReturnType }
     *     
     */
    public void setPreferenceCenters(PreferenceCenterContainerReturnType value) {
        this.preferenceCenters = value;
    }

    /**
     * Gets the value of the franchisees property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFranchiseeContainerReturnType }
     *     
     */
    public CustomerFranchiseeContainerReturnType getFranchisees() {
        return franchisees;
    }

    /**
     * Sets the value of the franchisees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFranchiseeContainerReturnType }
     *     
     */
    public void setFranchisees(CustomerFranchiseeContainerReturnType value) {
        this.franchisees = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

}
