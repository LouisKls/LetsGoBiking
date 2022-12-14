
package main.java.soap.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IRoutingService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IRoutingService {


    /**
     * 
     * @param origin
     * @param destination
     * @return
     *     returns main.java.soap.ws.client.Itinerary
     */
    @WebMethod(operationName = "GetItinerary", action = "http://tempuri.org/IRoutingService/GetItinerary")
    @WebResult(name = "GetItineraryResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetItinerary", targetNamespace = "http://tempuri.org/", className = "main.java.soap.ws.client.GetItinerary")
    @ResponseWrapper(localName = "GetItineraryResponse", targetNamespace = "http://tempuri.org/", className = "main.java.soap.ws.client.GetItineraryResponse")
    public Itinerary getItinerary(
        @WebParam(name = "origin", targetNamespace = "http://tempuri.org/")
        String origin,
        @WebParam(name = "destination", targetNamespace = "http://tempuri.org/")
        String destination);

    /**
     * 
     * @param origin
     * @param destination
     * @param queue
     * @param currentMode
     * @return
     *     returns main.java.soap.ws.client.QueueWayPoints
     */
    @WebMethod(operationName = "UpdateSteps", action = "http://tempuri.org/IRoutingService/UpdateSteps")
    @WebResult(name = "UpdateStepsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateSteps", targetNamespace = "http://tempuri.org/", className = "main.java.soap.ws.client.UpdateSteps")
    @ResponseWrapper(localName = "UpdateStepsResponse", targetNamespace = "http://tempuri.org/", className = "main.java.soap.ws.client.UpdateStepsResponse")
    public QueueWayPoints updateSteps(
        @WebParam(name = "origin", targetNamespace = "http://tempuri.org/")
        GeoCoordinate origin,
        @WebParam(name = "destination", targetNamespace = "http://tempuri.org/")
        GeoCoordinate destination,
        @WebParam(name = "currentMode", targetNamespace = "http://tempuri.org/")
        String currentMode,
        @WebParam(name = "queue", targetNamespace = "http://tempuri.org/")
        String queue);

    /**
     * 
     * @param queuename
     * @param origin
     * @param destination
     * @return
     *     returns main.java.soap.ws.client.Itinerary
     */
    @WebMethod(operationName = "GetItineraryV2", action = "http://tempuri.org/IRoutingService/GetItineraryV2")
    @WebResult(name = "GetItineraryV2Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetItineraryV2", targetNamespace = "http://tempuri.org/", className = "main.java.soap.ws.client.GetItineraryV2")
    @ResponseWrapper(localName = "GetItineraryV2Response", targetNamespace = "http://tempuri.org/", className = "main.java.soap.ws.client.GetItineraryV2Response")
    public Itinerary getItineraryV2(
        @WebParam(name = "origin", targetNamespace = "http://tempuri.org/")
        String origin,
        @WebParam(name = "destination", targetNamespace = "http://tempuri.org/")
        String destination,
        @WebParam(name = "queuename", targetNamespace = "http://tempuri.org/")
        String queuename);

}
