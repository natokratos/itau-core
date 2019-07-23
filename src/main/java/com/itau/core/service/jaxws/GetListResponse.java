
package com.itau.core.service.jaxws;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getListResponse", namespace = "http://server.service.core.itau.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListResponse", namespace = "http://server.service.core.itau.com/")
public class GetListResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.itau.core.entity.Account> _return;

    /**
     * 
     * @return
     *     returns List<Account>
     */
    public List<com.itau.core.entity.Account> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.itau.core.entity.Account> _return) {
        this._return = _return;
    }

}
