
package com.azevedo.cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExemploService", targetNamespace = "http://azevedo.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExemploService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcula", targetNamespace = "http://azevedo.com/", className = "com.azevedo.cliente.Calcula")
    @ResponseWrapper(localName = "calculaResponse", targetNamespace = "http://azevedo.com/", className = "com.azevedo.cliente.CalculaResponse")
    @Action(input = "http://azevedo.com/ExemploService/calculaRequest", output = "http://azevedo.com/ExemploService/calculaResponse")
    public int calcula(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mostrarNome", targetNamespace = "http://azevedo.com/", className = "com.azevedo.cliente.MostrarNome")
    @ResponseWrapper(localName = "mostrarNomeResponse", targetNamespace = "http://azevedo.com/", className = "com.azevedo.cliente.MostrarNomeResponse")
    @Action(input = "http://azevedo.com/ExemploService/mostrarNomeRequest", output = "http://azevedo.com/ExemploService/mostrarNomeResponse")
    public String mostrarNome(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
