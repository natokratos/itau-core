
package com.itau.core.service.jaxws;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getList", namespace = "http://server.service.core.itau.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getList", namespace = "http://server.service.core.itau.com/")
public class GetList {

    @XmlElement(name = "customerId", namespace = "")
    private String customerId;

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
