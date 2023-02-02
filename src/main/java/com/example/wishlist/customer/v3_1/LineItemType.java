
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
 * <p>Java class for LineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BeginDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SaleForDelivery" type="{http://v3_1.customer.webservices.csx.dtv.com/}SaleForDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="PreviousLayaway" type="{http://v3_1.customer.webservices.csx.dtv.com/}PreviousLayawayType" minOccurs="0"/&gt;
 *         &lt;element name="PreviousCustomerOrder" type="{http://v3_1.customer.webservices.csx.dtv.com/}PreviousCustomerOrderType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerOrderForDelivery" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerOrderForDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerOrderForPickup" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerOrderForPickupType" minOccurs="0"/&gt;
 *         &lt;element name="Return" type="{http://v3_1.customer.webservices.csx.dtv.com/}ReturnType" minOccurs="0"/&gt;
 *         &lt;element name="Sale" type="{http://v3_1.customer.webservices.csx.dtv.com/}SaleType" minOccurs="0"/&gt;
 *         &lt;element name="Tender" type="{http://v3_1.customer.webservices.csx.dtv.com/}TenderType" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{http://v3_1.customer.webservices.csx.dtv.com/}TaxType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetailPriceModifier" type="{http://v3_1.customer.webservices.csx.dtv.com/}RetailPriceModifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="VoidFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemType", propOrder = {
    "sequenceNumber",
    "beginDateTime",
    "endDateTime",
    "saleForDelivery",
    "previousLayaway",
    "previousCustomerOrder",
    "customerOrderForDelivery",
    "customerOrderForPickup",
    "_return",
    "sale",
    "tender",
    "tax",
    "documentType",
    "activityCode",
    "retailPriceModifier"
})
public class LineItemType {

    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElement(name = "BeginDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDateTime;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "SaleForDelivery")
    protected SaleForDeliveryType saleForDelivery;
    @XmlElement(name = "PreviousLayaway")
    protected PreviousLayawayType previousLayaway;
    @XmlElement(name = "PreviousCustomerOrder")
    protected PreviousCustomerOrderType previousCustomerOrder;
    @XmlElement(name = "CustomerOrderForDelivery")
    protected CustomerOrderForDeliveryType customerOrderForDelivery;
    @XmlElement(name = "CustomerOrderForPickup")
    protected CustomerOrderForPickupType customerOrderForPickup;
    @XmlElement(name = "Return")
    protected ReturnType _return;
    @XmlElement(name = "Sale")
    protected SaleType sale;
    @XmlElement(name = "Tender")
    protected TenderType tender;
    @XmlElement(name = "Tax")
    protected TaxType tax;
    @XmlElement(name = "DocumentType")
    protected String documentType;
    @XmlElement(name = "ActivityCode")
    protected String activityCode;
    @XmlElement(name = "RetailPriceModifier")
    protected List<RetailPriceModifierType> retailPriceModifier;
    @XmlAttribute(name = "VoidFlag")
    protected Boolean voidFlag;

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

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDateTime(XMLGregorianCalendar value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the saleForDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link SaleForDeliveryType }
     *     
     */
    public SaleForDeliveryType getSaleForDelivery() {
        return saleForDelivery;
    }

    /**
     * Sets the value of the saleForDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleForDeliveryType }
     *     
     */
    public void setSaleForDelivery(SaleForDeliveryType value) {
        this.saleForDelivery = value;
    }

    /**
     * Gets the value of the previousLayaway property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousLayawayType }
     *     
     */
    public PreviousLayawayType getPreviousLayaway() {
        return previousLayaway;
    }

    /**
     * Sets the value of the previousLayaway property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousLayawayType }
     *     
     */
    public void setPreviousLayaway(PreviousLayawayType value) {
        this.previousLayaway = value;
    }

    /**
     * Gets the value of the previousCustomerOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousCustomerOrderType }
     *     
     */
    public PreviousCustomerOrderType getPreviousCustomerOrder() {
        return previousCustomerOrder;
    }

    /**
     * Sets the value of the previousCustomerOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousCustomerOrderType }
     *     
     */
    public void setPreviousCustomerOrder(PreviousCustomerOrderType value) {
        this.previousCustomerOrder = value;
    }

    /**
     * Gets the value of the customerOrderForDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderForDeliveryType }
     *     
     */
    public CustomerOrderForDeliveryType getCustomerOrderForDelivery() {
        return customerOrderForDelivery;
    }

    /**
     * Sets the value of the customerOrderForDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderForDeliveryType }
     *     
     */
    public void setCustomerOrderForDelivery(CustomerOrderForDeliveryType value) {
        this.customerOrderForDelivery = value;
    }

    /**
     * Gets the value of the customerOrderForPickup property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderForPickupType }
     *     
     */
    public CustomerOrderForPickupType getCustomerOrderForPickup() {
        return customerOrderForPickup;
    }

    /**
     * Sets the value of the customerOrderForPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderForPickupType }
     *     
     */
    public void setCustomerOrderForPickup(CustomerOrderForPickupType value) {
        this.customerOrderForPickup = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnType }
     *     
     */
    public ReturnType getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnType }
     *     
     */
    public void setReturn(ReturnType value) {
        this._return = value;
    }

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link SaleType }
     *     
     */
    public SaleType getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleType }
     *     
     */
    public void setSale(SaleType value) {
        this.sale = value;
    }

    /**
     * Gets the value of the tender property.
     * 
     * @return
     *     possible object is
     *     {@link TenderType }
     *     
     */
    public TenderType getTender() {
        return tender;
    }

    /**
     * Sets the value of the tender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderType }
     *     
     */
    public void setTender(TenderType value) {
        this.tender = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTax(TaxType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the retailPriceModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPriceModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailPriceModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPriceModifierType }
     * 
     * 
     */
    public List<RetailPriceModifierType> getRetailPriceModifier() {
        if (retailPriceModifier == null) {
            retailPriceModifier = new ArrayList<RetailPriceModifierType>();
        }
        return this.retailPriceModifier;
    }

    /**
     * Gets the value of the voidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoidFlag() {
        return voidFlag;
    }

    /**
     * Sets the value of the voidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoidFlag(Boolean value) {
        this.voidFlag = value;
    }

}
