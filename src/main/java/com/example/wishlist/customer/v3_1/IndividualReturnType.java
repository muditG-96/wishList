
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://v3_1.customer.webservices.csx.dtv.com/}NameType" minOccurs="0"/&gt;
 *         &lt;element name="ContactInformation" type="{http://v3_1.customer.webservices.csx.dtv.com/}ContactInformationReturnType" minOccurs="0"/&gt;
 *         &lt;element name="PersonalSummary" type="{http://v3_1.customer.webservices.csx.dtv.com/}PersonalSummaryReturnType" minOccurs="0"/&gt;
 *         &lt;element name="SocioEconomicProfile" type="{http://v3_1.customer.webservices.csx.dtv.com/}SocioEconomicProfileReturnType" minOccurs="0"/&gt;
 *         &lt;element name="LifetimeActivitySummary" type="{http://v3_1.customer.webservices.csx.dtv.com/}LifetimeActivitySummaryType" minOccurs="0"/&gt;
 *         &lt;element name="YearToDateActivitySummary" type="{http://v3_1.customer.webservices.csx.dtv.com/}YearToDateActivitySummaryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualReturnType", propOrder = {
    "suffix",
    "sortingName",
    "nickName",
    "salutation",
    "name",
    "contactInformation",
    "personalSummary",
    "socioEconomicProfile",
    "lifetimeActivitySummary",
    "yearToDateActivitySummary"
})
public class IndividualReturnType {

    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "SortingName")
    protected String sortingName;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "Salutation")
    protected String salutation;
    @XmlElement(name = "Name")
    protected NameType name;
    @XmlElement(name = "ContactInformation")
    protected ContactInformationReturnType contactInformation;
    @XmlElement(name = "PersonalSummary")
    protected PersonalSummaryReturnType personalSummary;
    @XmlElement(name = "SocioEconomicProfile")
    protected SocioEconomicProfileReturnType socioEconomicProfile;
    @XmlElement(name = "LifetimeActivitySummary")
    protected LifetimeActivitySummaryType lifetimeActivitySummary;
    @XmlElement(name = "YearToDateActivitySummary")
    protected YearToDateActivitySummaryType yearToDateActivitySummary;

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the sortingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortingName() {
        return sortingName;
    }

    /**
     * Sets the value of the sortingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortingName(String value) {
        this.sortingName = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationReturnType }
     *     
     */
    public ContactInformationReturnType getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationReturnType }
     *     
     */
    public void setContactInformation(ContactInformationReturnType value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the personalSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalSummaryReturnType }
     *     
     */
    public PersonalSummaryReturnType getPersonalSummary() {
        return personalSummary;
    }

    /**
     * Sets the value of the personalSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalSummaryReturnType }
     *     
     */
    public void setPersonalSummary(PersonalSummaryReturnType value) {
        this.personalSummary = value;
    }

    /**
     * Gets the value of the socioEconomicProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SocioEconomicProfileReturnType }
     *     
     */
    public SocioEconomicProfileReturnType getSocioEconomicProfile() {
        return socioEconomicProfile;
    }

    /**
     * Sets the value of the socioEconomicProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocioEconomicProfileReturnType }
     *     
     */
    public void setSocioEconomicProfile(SocioEconomicProfileReturnType value) {
        this.socioEconomicProfile = value;
    }

    /**
     * Gets the value of the lifetimeActivitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link LifetimeActivitySummaryType }
     *     
     */
    public LifetimeActivitySummaryType getLifetimeActivitySummary() {
        return lifetimeActivitySummary;
    }

    /**
     * Sets the value of the lifetimeActivitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifetimeActivitySummaryType }
     *     
     */
    public void setLifetimeActivitySummary(LifetimeActivitySummaryType value) {
        this.lifetimeActivitySummary = value;
    }

    /**
     * Gets the value of the yearToDateActivitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link YearToDateActivitySummaryType }
     *     
     */
    public YearToDateActivitySummaryType getYearToDateActivitySummary() {
        return yearToDateActivitySummary;
    }

    /**
     * Sets the value of the yearToDateActivitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearToDateActivitySummaryType }
     *     
     */
    public void setYearToDateActivitySummary(YearToDateActivitySummaryType value) {
        this.yearToDateActivitySummary = value;
    }

}
