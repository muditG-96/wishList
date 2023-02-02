
package com.example.wishlist.customer.v3_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOrderForPickupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderForPickupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UnitCostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RegularSalesUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ActualSalesUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExtendedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Associate" type="{http://v3_1.customer.webservices.csx.dtv.com/}AssociateType" minOccurs="0"/&gt;
 *         &lt;element name="RetailPriceModifier" type="{http://v3_1.customer.webservices.csx.dtv.com/}RetailPriceModifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PercentageOfItem" type="{http://v3_1.customer.webservices.csx.dtv.com/}PercentageOfItemType" minOccurs="0"/&gt;
 *         &lt;element name="Delivery" type="{http://v3_1.customer.webservices.csx.dtv.com/}DeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="InventoryReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderForPickupType", propOrder = {
    "itemID",
    "unitCostPrice",
    "regularSalesUnitPrice",
    "actualSalesUnitPrice",
    "extendedAmount",
    "quantity",
    "serialNumber",
    "associate",
    "retailPriceModifier",
    "percentageOfItem",
    "delivery",
    "inventoryReservationID",
    "from"
})
public class CustomerOrderForPickupType {

    @XmlElement(name = "ItemID", required = true)
    protected String itemID;
    @XmlElement(name = "UnitCostPrice", required = true)
    protected BigDecimal unitCostPrice;
    @XmlElement(name = "RegularSalesUnitPrice", required = true)
    protected BigDecimal regularSalesUnitPrice;
    @XmlElement(name = "ActualSalesUnitPrice", required = true)
    protected BigDecimal actualSalesUnitPrice;
    @XmlElement(name = "ExtendedAmount", required = true)
    protected BigDecimal extendedAmount;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Associate")
    protected AssociateType associate;
    @XmlElement(name = "RetailPriceModifier")
    protected List<RetailPriceModifierType> retailPriceModifier;
    @XmlElement(name = "PercentageOfItem")
    protected PercentageOfItemType percentageOfItem;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "InventoryReservationID")
    protected String inventoryReservationID;
    @XmlElement(name = "From")
    protected String from;
    @XmlAttribute(name = "ItemType")
    protected String itemType;
    @XmlAttribute(name = "OrderStatus")
    protected String orderStatus;
    @XmlAttribute(name = "Action")
    protected String action;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the unitCostPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCostPrice() {
        return unitCostPrice;
    }

    /**
     * Sets the value of the unitCostPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCostPrice(BigDecimal value) {
        this.unitCostPrice = value;
    }

    /**
     * Gets the value of the regularSalesUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegularSalesUnitPrice() {
        return regularSalesUnitPrice;
    }

    /**
     * Sets the value of the regularSalesUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegularSalesUnitPrice(BigDecimal value) {
        this.regularSalesUnitPrice = value;
    }

    /**
     * Gets the value of the actualSalesUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualSalesUnitPrice() {
        return actualSalesUnitPrice;
    }

    /**
     * Sets the value of the actualSalesUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualSalesUnitPrice(BigDecimal value) {
        this.actualSalesUnitPrice = value;
    }

    /**
     * Gets the value of the extendedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendedAmount() {
        return extendedAmount;
    }

    /**
     * Sets the value of the extendedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendedAmount(BigDecimal value) {
        this.extendedAmount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the associate property.
     * 
     * @return
     *     possible object is
     *     {@link AssociateType }
     *     
     */
    public AssociateType getAssociate() {
        return associate;
    }

    /**
     * Sets the value of the associate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociateType }
     *     
     */
    public void setAssociate(AssociateType value) {
        this.associate = value;
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
     * Gets the value of the percentageOfItem property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageOfItemType }
     *     
     */
    public PercentageOfItemType getPercentageOfItem() {
        return percentageOfItem;
    }

    /**
     * Sets the value of the percentageOfItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageOfItemType }
     *     
     */
    public void setPercentageOfItem(PercentageOfItemType value) {
        this.percentageOfItem = value;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDelivery(DeliveryType value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the inventoryReservationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryReservationID() {
        return inventoryReservationID;
    }

    /**
     * Sets the value of the inventoryReservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryReservationID(String value) {
        this.inventoryReservationID = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

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

}
