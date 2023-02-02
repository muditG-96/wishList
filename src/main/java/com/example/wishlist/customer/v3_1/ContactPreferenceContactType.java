
package com.example.wishlist.customer.v3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactPreferenceContactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactPreferenceContactType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mail"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Phone"/&gt;
 *     &lt;enumeration value="Fax"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactPreferenceContactType")
@XmlEnum
public enum ContactPreferenceContactType {

    @XmlEnumValue("Mail")
    MAIL("Mail"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Fax")
    FAX("Fax");
    private final String value;

    ContactPreferenceContactType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactPreferenceContactType fromValue(String v) {
        for (ContactPreferenceContactType c: ContactPreferenceContactType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
