
package com.example.wishlist.customer.v3_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisualizerItemsContainerReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisualizerItemsContainerReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VisualizerItems" type="{http://v3_1.customer.webservices.csx.dtv.com/}VisualizerItemReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisualizerItemsContainerReturnType", propOrder = {
    "visualizerItems"
})
public class VisualizerItemsContainerReturnType {

    @XmlElement(name = "VisualizerItems")
    protected List<VisualizerItemReturnType> visualizerItems;

    /**
     * Gets the value of the visualizerItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visualizerItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisualizerItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualizerItemReturnType }
     * 
     * 
     */
    public List<VisualizerItemReturnType> getVisualizerItems() {
        if (visualizerItems == null) {
            visualizerItems = new ArrayList<VisualizerItemReturnType>();
        }
        return this.visualizerItems;
    }

}
