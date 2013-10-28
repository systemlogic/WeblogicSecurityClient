
package com.emc.security;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emc.security package. 
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

    private final static QName _SayHai_QNAME = new QName("http://Security.emc.com/", "sayHai");
    private final static QName _SayHaiResponse_QNAME = new QName("http://Security.emc.com/", "sayHaiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emc.security
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHaiResponse }
     * 
     */
    public SayHaiResponse createSayHaiResponse() {
        return new SayHaiResponse();
    }

    /**
     * Create an instance of {@link SayHai }
     * 
     */
    public SayHai createSayHai() {
        return new SayHai();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHai }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Security.emc.com/", name = "sayHai")
    public JAXBElement<SayHai> createSayHai(SayHai value) {
        return new JAXBElement<SayHai>(_SayHai_QNAME, SayHai.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHaiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Security.emc.com/", name = "sayHaiResponse")
    public JAXBElement<SayHaiResponse> createSayHaiResponse(SayHaiResponse value) {
        return new JAXBElement<SayHaiResponse>(_SayHaiResponse_QNAME, SayHaiResponse.class, null, value);
    }

}
