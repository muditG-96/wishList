
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameLocationReturnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameLocationReturnType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="First"/&gt;
 *     &lt;enumeration value="First2"/&gt;
 *     &lt;enumeration value="Middle"/&gt;
 *     &lt;enumeration value="Last"/&gt;
 *     &lt;enumeration value="Last2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameLocationReturnType")
@XmlEnum
public enum NameLocationReturnType {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("First2")
    FIRST_2("First2"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Last")
    LAST("Last"),
    @XmlEnumValue("Last2")
    LAST_2("Last2");
    private final String value;

    NameLocationReturnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameLocationReturnType fromValue(String v) {
        for (NameLocationReturnType c: NameLocationReturnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
