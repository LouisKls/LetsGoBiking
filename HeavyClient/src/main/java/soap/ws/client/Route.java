
package main.java.soap.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Route complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Route"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segments" type="{http://schemas.datacontract.org/2004/07/RoutingServer}ArrayOfSegment" minOccurs="0"/&gt;
 *         &lt;element name="summary" type="{http://schemas.datacontract.org/2004/07/RoutingServer}Summary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
    "geometry",
    "segments",
    "summary"
})
public class Route {

    @XmlElementRef(name = "geometry", namespace = "http://schemas.datacontract.org/2004/07/RoutingServer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geometry;
    @XmlElementRef(name = "segments", namespace = "http://schemas.datacontract.org/2004/07/RoutingServer", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSegment> segments;
    @XmlElementRef(name = "summary", namespace = "http://schemas.datacontract.org/2004/07/RoutingServer", type = JAXBElement.class, required = false)
    protected JAXBElement<Summary> summary;

    /**
     * Obtient la valeur de la propriété geometry.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeometry() {
        return geometry;
    }

    /**
     * Définit la valeur de la propriété geometry.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeometry(JAXBElement<String> value) {
        this.geometry = value;
    }

    /**
     * Obtient la valeur de la propriété segments.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSegment> getSegments() {
        return segments;
    }

    /**
     * Définit la valeur de la propriété segments.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     *     
     */
    public void setSegments(JAXBElement<ArrayOfSegment> value) {
        this.segments = value;
    }

    /**
     * Obtient la valeur de la propriété summary.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Summary }{@code >}
     *     
     */
    public JAXBElement<Summary> getSummary() {
        return summary;
    }

    /**
     * Définit la valeur de la propriété summary.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Summary }{@code >}
     *     
     */
    public void setSummary(JAXBElement<Summary> value) {
        this.summary = value;
    }

}
