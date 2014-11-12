/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import hotelreservationservices.CreditcardInformationType;
import hotelreservationservices.HotelType;
import hotelreservationservices.HotelsType;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author khannoori
 */
@WebService(serviceName = "HotelReservationService", portName = "HotelReservationServicesBindingPort", endpointInterface = "hotelreservationservices.HotelReservationServices", targetNamespace = "http://HotelReservationServices", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/HotelReservation.wsdl")
public class NewWebServiceFromWSDL {

    private final ArrayList<HotelType> hotels = new ArrayList<HotelType>();
    
    // New
    
    public NewWebServiceFromWSDL() {
        
        for (int i = 1; i < 10; i++) {
            HotelType hotel = new HotelType();
            hotel.setName("Hotel " + i);
            hotel.setAddress("Address " + i);
            hotel.setBookingNr(i);
            hotel.setPrice(i * 1000);
            hotel.setPaymentGuarantee((i % 2) == 0);
            hotels.add(hotel);
        }
        
    }
    
    // Functions
    
    public HotelsType getHotels(String city, XMLGregorianCalendar arrival, XMLGregorianCalendar departure) {
        
        HotelsType result = new HotelsType();
        result.getHotels().addAll(hotels);
        return result;
        
    }
    
    public void bookHotel(int booking, CreditcardInformationType CreditCard) throws Exception {
        
        for (HotelType hotel : hotels) {
            if (hotel.getBookingNr() == booking) {
                
                if (hotel.isPaymentGuarantee()) {
                    // TODO: bank.validateCreditCard
                }
                
                return;
            }
        }
        
        throw new Exception("Invalid booking number: " + booking + ".");
        
    }
    
    public void cancelHotel(int booking) throws Exception {
        
        for (HotelType hotel : hotels) {
            if (hotel.getBookingNr() == booking) {
                
                // TODO: Cancel reservation.
                
                return;
                
            }
        }
        
        throw new Exception("Invalid booking number: " + booking + ".");
        
    }
    
    // --------
    
    public void getHotel(java.lang.String city, javax.xml.datatype.XMLGregorianCalendar arrivalDate, javax.xml.datatype.XMLGregorianCalendar departureDate, javax.xml.ws.Holder<hotelreservationservices.HotelType> hotelsNameArray, javax.xml.ws.Holder<java.lang.String> addressOfHotel, javax.xml.ws.Holder<Integer> bookingNr, javax.xml.ws.Holder<Float> priceForWholeStay) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}