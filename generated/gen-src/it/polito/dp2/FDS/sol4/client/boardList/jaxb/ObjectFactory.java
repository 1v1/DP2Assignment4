//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.17 at 12:10:39 PM CET 
//


package it.polito.dp2.FDS.sol4.client.boardList.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polito.dp2.FDS.sol4.client.boardList.jaxb package. 
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

    private final static QName _BoardList_QNAME = new QName("http://pad.polito.it/boardList", "boardList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.FDS.sol4.client.boardList.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BoardListType }
     * 
     */
    public BoardListType createBoardListType() {
        return new BoardListType();
    }

    /**
     * Create an instance of {@link PassengerType }
     * 
     */
    public PassengerType createPassengerType() {
        return new PassengerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoardListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/boardList", name = "boardList")
    public JAXBElement<BoardListType> createBoardList(BoardListType value) {
        return new JAXBElement<BoardListType>(_BoardList_QNAME, BoardListType.class, null, value);
    }

}