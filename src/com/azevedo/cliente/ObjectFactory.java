
package com.azevedo.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.azevedo.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculaResponse_QNAME = new QName("http://azevedo.com/", "calculaResponse");
    private final static QName _Calcula_QNAME = new QName("http://azevedo.com/", "calcula");
    private final static QName _MostrarNome_QNAME = new QName("http://azevedo.com/", "mostrarNome");
    private final static QName _MostrarNomeResponse_QNAME = new QName("http://azevedo.com/", "mostrarNomeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.azevedo.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MostrarNomeResponse }
     * 
     */
    public MostrarNomeResponse createMostrarNomeResponse() {
        return new MostrarNomeResponse();
    }

    /**
     * Create an instance of {@link CalculaResponse }
     * 
     */
    public CalculaResponse createCalculaResponse() {
        return new CalculaResponse();
    }

    /**
     * Create an instance of {@link Calcula }
     * 
     */
    public Calcula createCalcula() {
        return new Calcula();
    }

    /**
     * Create an instance of {@link MostrarNome }
     * 
     */
    public MostrarNome createMostrarNome() {
        return new MostrarNome();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://azevedo.com/", name = "calculaResponse")
    public JAXBElement<CalculaResponse> createCalculaResponse(CalculaResponse value) {
        return new JAXBElement<CalculaResponse>(_CalculaResponse_QNAME, CalculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://azevedo.com/", name = "calcula")
    public JAXBElement<Calcula> createCalcula(Calcula value) {
        return new JAXBElement<Calcula>(_Calcula_QNAME, Calcula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://azevedo.com/", name = "mostrarNome")
    public JAXBElement<MostrarNome> createMostrarNome(MostrarNome value) {
        return new JAXBElement<MostrarNome>(_MostrarNome_QNAME, MostrarNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://azevedo.com/", name = "mostrarNomeResponse")
    public JAXBElement<MostrarNomeResponse> createMostrarNomeResponse(MostrarNomeResponse value) {
        return new JAXBElement<MostrarNomeResponse>(_MostrarNomeResponse_QNAME, MostrarNomeResponse.class, null, value);
    }

}
