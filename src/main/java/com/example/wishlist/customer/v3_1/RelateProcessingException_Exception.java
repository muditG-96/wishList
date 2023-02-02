
package com.example.wishlist.customer.v3_1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RelateProcessingException", targetNamespace = "http://v3_1.customer.webservices.csx.dtv.com/")
public class RelateProcessingException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RelateProcessingException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public RelateProcessingException_Exception(String message, RelateProcessingException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public RelateProcessingException_Exception(String message, RelateProcessingException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.dtv.csx.webservices.customer.v3_1.RelateProcessingException
     */
    public RelateProcessingException getFaultInfo() {
        return faultInfo;
    }

}
