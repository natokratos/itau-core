
package com.itau.core.service.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getReadResponse", namespace = "http://server.service.core.itau.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReadResponse", namespace = "http://server.service.core.itau.com/")
public class GetReadResponse {

    @XmlElement(name = "return", namespace = "")
    private com.itau.core.entity.Account _return;

    /**
     * 
     * @return
     *     returns Account
     */
    public com.itau.core.entity.Account getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.itau.core.entity.Account _return) {
        this._return = _return;
    }

}
