
package com.itau.core.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getRead", namespace = "http://server.service.core.itau.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRead", namespace = "http://server.service.core.itau.com/", propOrder = {
    "accountId",
    "customerId"
})
public class GetRead {

    @XmlElement(name = "accountId", namespace = "")
    private String accountId;
    @XmlElement(name = "customerId", namespace = "")
    private String customerId;

    /**
     * 
     * @return
     *     returns String
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * 
     * @param accountId
     *     the value for the accountId property
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * 
     * @param customerId
     *     the value for the customerId property
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
