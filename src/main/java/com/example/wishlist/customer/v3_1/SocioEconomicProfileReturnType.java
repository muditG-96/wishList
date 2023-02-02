
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocioEconomicProfileReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocioEconomicProfileReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnnualIncomeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetWorth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HighestEducationalLevelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocioEconomicProfileReturnType", propOrder = {
    "annualIncomeAmount",
    "netWorth",
    "highestEducationalLevelName"
})
public class SocioEconomicProfileReturnType {

    @XmlElement(name = "AnnualIncomeAmount")
    protected String annualIncomeAmount;
    @XmlElement(name = "NetWorth")
    protected String netWorth;
    @XmlElement(name = "HighestEducationalLevelName")
    protected String highestEducationalLevelName;

    /**
     * Gets the value of the annualIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualIncomeAmount() {
        return annualIncomeAmount;
    }

    /**
     * Sets the value of the annualIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualIncomeAmount(String value) {
        this.annualIncomeAmount = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetWorth(String value) {
        this.netWorth = value;
    }

    /**
     * Gets the value of the highestEducationalLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighestEducationalLevelName() {
        return highestEducationalLevelName;
    }

    /**
     * Sets the value of the highestEducationalLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighestEducationalLevelName(String value) {
        this.highestEducationalLevelName = value;
    }

}
