/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dk.dtu.imm.fastmoney.BankService;
import dk.dtu.imm.fastmoney.CreditCardFaultMessage;
import hotelreservationservices.CreditcardInformationType;
import hotelreservationservices.HotelType;
import hotelreservationservices.HotelsType;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author khannoori
 */
@WebService(serviceName = "HotelReservationService", portName = "HotelReservationServicesBindingPort", endpointInterface = "hotelreservationservices.HotelReservationServices", targetNamespace = "http://HotelReservationServices", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/HotelReservation.wsdl")
public class NewWebServiceFromWSDL {
    //@WebServiceRef(wsdlLocation = "WEB-INF/wsdl/fastmoney.imm.dtu.dk_8080/BankService.wsdl")
    private BankService service;

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
  /* 
    public void getHotel(java.lang.String city, javax.xml.datatype.XMLGregorianCalendar arrivalDate, javax.xml.datatype.XMLGregorianCalendar departureDate, javax.xml.ws.Holder<hotelreservationservices.HotelType> hotelsNameArray, javax.xml.ws.Holder<java.lang.String> addressOfHotel, javax.xml.ws.Holder<Integer> bookingNr, javax.xml.ws.Holder<Float> priceForWholeStay) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
 */   

    private boolean chargeCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankPortType port = service.getBankPort();
        return port.chargeCreditCard(group, creditCardInfo, amount, account);
    }

    private boolean refundCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankPortType port = service.getBankPort();
        return port.refundCreditCard(group, creditCardInfo, amount, account);
    }

    private boolean validateCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankPortType port = service.getBankPort();
        return port.validateCreditCard(group, creditCardInfo, amount);
    }
}