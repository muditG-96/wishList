
package com.example.wishlist.customer.v3_1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Authorization" type="{http://v3_1.customer.webservices.csx.dtv.com/}AuthorizationType" minOccurs="0"/&gt;
 *         &lt;element name="CreditDebit" type="{http://v3_1.customer.webservices.csx.dtv.com/}CreditDebitType" minOccurs="0"/&gt;
 *         &lt;element name="GiftCard" type="{http://v3_1.customer.webservices.csx.dtv.com/}GiftCardType" minOccurs="0"/&gt;
 *         &lt;element name="Voucher" type="{http://v3_1.customer.webservices.csx.dtv.com/}VoucherType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerVerification" type="{http://v3_1.customer.webservices.csx.dtv.com/}CustomerVerificationType" minOccurs="0"/&gt;
 *         &lt;element name="Check" type="{http://v3_1.customer.webservices.csx.dtv.com/}CheckType" minOccurs="0"/&gt;
 *         &lt;element name="Coupon" type="{http://v3_1.customer.webservices.csx.dtv.com/}CouponType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TenderType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderType", propOrder = {
    "tenderID",
    "amount",
    "authorization",
    "creditDebit",
    "giftCard",
    "voucher",
    "customerVerification",
    "check",
    "coupon"
})
public class TenderType {

    @XmlElement(name = "TenderID")
    protected String tenderID;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Authorization")
    protected AuthorizationType authorization;
    @XmlElement(name = "CreditDebit")
    protected CreditDebitType creditDebit;
    @XmlElement(name = "GiftCard")
    protected GiftCardType giftCard;
    @XmlElement(name = "Voucher")
    protected VoucherType voucher;
    @XmlElement(name = "CustomerVerification")
    protected CustomerVerificationType customerVerification;
    @XmlElement(name = "Check")
    protected CheckType check;
    @XmlElement(name = "Coupon")
    protected CouponType coupon;
    @XmlAttribute(name = "TenderType")
    protected String tenderType;

    /**
     * Gets the value of the tenderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderID() {
        return tenderID;
    }

    /**
     * Sets the value of the tenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderID(String value) {
        this.tenderID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType }
     *     
     */
    public AuthorizationType getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType }
     *     
     */
    public void setAuthorization(AuthorizationType value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the creditDebit property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitType }
     *     
     */
    public CreditDebitType getCreditDebit() {
        return creditDebit;
    }

    /**
     * Sets the value of the creditDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitType }
     *     
     */
    public void setCreditDebit(CreditDebitType value) {
        this.creditDebit = value;
    }

    /**
     * Gets the value of the giftCard property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCardType }
     *     
     */
    public GiftCardType getGiftCard() {
        return giftCard;
    }

    /**
     * Sets the value of the giftCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCardType }
     *     
     */
    public void setGiftCard(GiftCardType value) {
        this.giftCard = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherType }
     *     
     */
    public VoucherType getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherType }
     *     
     */
    public void setVoucher(VoucherType value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the customerVerification property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerVerificationType }
     *     
     */
    public CustomerVerificationType getCustomerVerification() {
        return customerVerification;
    }

    /**
     * Sets the value of the customerVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerVerificationType }
     *     
     */
    public void setCustomerVerification(CustomerVerificationType value) {
        this.customerVerification = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link CheckType }
     *     
     */
    public CheckType getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType }
     *     
     */
    public void setCheck(CheckType value) {
        this.check = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link CouponType }
     *     
     */
    public CouponType getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponType }
     *     
     */
    public void setCoupon(CouponType value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the tenderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderType() {
        return tenderType;
    }

    /**
     * Sets the value of the tenderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderType(String value) {
        this.tenderType = value;
    }

}
