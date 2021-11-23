
package cl.clarochile.generatetokencudbws.facade;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import cl.clarochile.generatetokencudbws.to.GenerateTokenResponseTO;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "generatetokencudbws", targetNamespace = "http://facade.generatetokencudbws.clarochile.cl")
@XmlSeeAlso({
    cl.clarochile.generatetokencudbws.facade.ObjectFactory.class,
    cl.clarochile.generatetokencudbws.to.ObjectFactory.class
})
public interface Generatetokencudbws {


    /**
     * 
     * @return
     *     returns cl.clarochile.generatetokencudbws.to.GenerateTokenResponseTO
     */
    @WebMethod
    @WebResult(name = "generateTokenCUDBiParamOut", targetNamespace = "http://facade.generatetokencudbws.clarochile.cl")
    @RequestWrapper(localName = "generatetokencudbws", targetNamespace = "http://facade.generatetokencudbws.clarochile.cl", className = "cl.clarochile.generatetokencudbws.facade.Generatetokencudbws_Type")
    @ResponseWrapper(localName = "generateTokenCUDBResponse", targetNamespace = "http://facade.generatetokencudbws.clarochile.cl", className = "cl.clarochile.generatetokencudbws.facade.GenerateTokenCUDBResponse")
    public GenerateTokenResponseTO generatetokencudbws();

}
