/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;

/**
 *
 * @author khannoori
 */
@WebService(serviceName = "HotelReservationServicesService", portName = "HotelReservationServicesPort", endpointInterface = "hotelreservationservices.HotelReservationServices", targetNamespace = "http://HotelReservationServices", wsdlLocation = "WEB-INF/wsdl/HotelReservationService/HotelReservationWrapper.wsdl")
public class HotelReservationService {

    public void getHotel(java.lang.String city, javax.xml.datatype.XMLGregorianCalendar arrivalDate, javax.xml.datatype.XMLGregorianCalendar departureDate, javax.xml.ws.Holder<hotelreservationservices.HotelsNameType> hotelsNameArray, javax.xml.ws.Holder<java.lang.String> addressOfHotel, javax.xml.ws.Holder<Integer> bookingNr, javax.xml.ws.Holder<Float> priceForWholeStay) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
      
    public boolean bookHotel(int bookinNr, String creditcardInformation){
        return true;
    
    } 
    public void cancelHotel(int bookingNr){
    
        
    }
    
}
