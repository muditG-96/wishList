
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StartsWith"/&gt;
 *     &lt;enumeration value="EndsWith"/&gt;
 *     &lt;enumeration value="Exact"/&gt;
 *     &lt;enumeration value="Contains"/&gt;
 *     &lt;enumeration value="SoundsLike"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchType")
@XmlEnum
public enum SearchType {

    @XmlEnumValue("StartsWith")
    STARTS_WITH("StartsWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("Exact")
    EXACT("Exact"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("SoundsLike")
    SOUNDS_LIKE("SoundsLike");
    private final String value;

    SearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchType fromValue(String v) {
        for (SearchType c: SearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
