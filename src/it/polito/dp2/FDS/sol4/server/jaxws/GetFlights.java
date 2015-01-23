
package it.polito.dp2.FDS.sol4.server.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getFlights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureAirport" type="{http://pad.polito.it/FDS}AirportType" minOccurs="0"/>
 *         &lt;element name="destinationAirport" type="{http://pad.polito.it/FDS}AirportType" minOccurs="0"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlights", propOrder = {
    "departureAirport",
    "destinationAirport",
    "departureTime"
})
public class GetFlights {

    @XmlElementRef(name = "departureAirport", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureAirport;
    @XmlElementRef(name = "destinationAirport", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationAirport;
    @XmlElementRef(name = "departureTime", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> departureTime;

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartureAirport(JAXBElement<String> value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the destinationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * Sets the value of the destinationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationAirport(JAXBElement<String> value) {
        this.destinationAirport = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDepartureTime(JAXBElement<XMLGregorianCalendar> value) {
        this.departureTime = value;
    }

}
