//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.24 at 10:01:36 PM CET 
//


package it.polito.dp2.FDS.sol4.client.fdsBoarding.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polito.dp2.FDS.sol4.client.fdsBoarding.jaxb package. 
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

    private final static QName _Boarding_QNAME = new QName("http://pad.polito.it/fdsBoarding", "boarding");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.FDS.sol4.client.fdsBoarding.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BoardingType }
     * 
     */
    public BoardingType createBoardingType() {
        return new BoardingType();
    }

    /**
     * Create an instance of {@link BoardingType.StartBoarding }
     * 
     */
    public BoardingType.StartBoarding createBoardingTypeStartBoarding() {
        return new BoardingType.StartBoarding();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoardingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/fdsBoarding", name = "boarding")
    public JAXBElement<BoardingType> createBoarding(BoardingType value) {
        return new JAXBElement<BoardingType>(_Boarding_QNAME, BoardingType.class, null, value);
    }

}
