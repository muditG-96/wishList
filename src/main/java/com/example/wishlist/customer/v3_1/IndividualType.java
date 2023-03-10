
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerNameType"/&gt;
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SortingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactInformation" type="{http://v3_1.customer.webservices.csx.dtv.com/}ContactInformationType"/&gt;
 *         &lt;element name="PersonalSummary" type="{http://v3_1.customer.webservices.csx.dtv.com/}PersonalSummaryType"/&gt;
 *         &lt;element name="SocioEconomicProfile" type="{http://v3_1.customer.webservices.csx.dtv.com/}SocioEconomicProfileType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualType", propOrder = {
    "name",
    "suffix",
    "sortingName",
    "nickName",
    "salutation",
    "contactInformation",
    "personalSummary",
    "socioEconomicProfile"
})
public class IndividualType {

    @XmlElement(name = "Name", required = true)
    protected CustomerNameType name;
    @XmlElement(name = "Suffix", required = true)
    protected String suffix;
    @XmlElement(name = "SortingName")
    protected String sortingName;
    @XmlElement(name = "NickName", required = true)
    protected String nickName;
    @XmlElement(name = "Salutation", required = true)
    protected String salutation;
    @XmlElement(name = "ContactInformation", required = true)
    protected ContactInformationType contactInformation;
    @XmlElement(name = "PersonalSummary", required = true)
    protected PersonalSummaryType personalSummary;
    @XmlElement(name = "SocioEconomicProfile", required = true)
    protected SocioEconomicProfileType socioEconomicProfile;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setName(CustomerNameType value) {
        this.name = value;
    }

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
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setContactInformation(ContactInformationType value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the personalSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalSummaryType }
     *     
     */
    public PersonalSummaryType getPersonalSummary() {
        return personalSummary;
    }

    /**
     * Sets the value of the personalSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalSummaryType }
     *     
     */
    public void setPersonalSummary(PersonalSummaryType value) {
        this.personalSummary = value;
    }

    /**
     * Gets the value of the socioEconomicProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SocioEconomicProfileType }
     *     
     */
    public SocioEconomicProfileType getSocioEconomicProfile() {
        return socioEconomicProfile;
    }

    /**
     * Sets the value of the socioEconomicProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocioEconomicProfileType }
     *     
     */
    public void setSocioEconomicProfile(SocioEconomicProfileType value) {
        this.socioEconomicProfile = value;
    }

}
