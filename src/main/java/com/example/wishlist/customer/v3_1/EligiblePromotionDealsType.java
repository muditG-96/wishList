
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EligiblePromotionDealsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligiblePromotionDealsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromotionDealId" type="{http://v3_1.customer.webservices.csx.dtv.com/}PromotionDealIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligiblePromotionDealsType", propOrder = {
    "promotionDealId"
})
public class EligiblePromotionDealsType {

    @XmlElement(name = "PromotionDealId")
    protected List<PromotionDealIdType> promotionDealId;

    /**
     * Gets the value of the promotionDealId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionDealId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionDealId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionDealIdType }
     * 
     * 
     */
    public List<PromotionDealIdType> getPromotionDealId() {
        if (promotionDealId == null) {
            promotionDealId = new ArrayList<PromotionDealIdType>();
        }
        return this.promotionDealId;
    }

}
