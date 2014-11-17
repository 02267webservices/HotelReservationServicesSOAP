package ws;

import dk.dtu.imm.fastmoney.BankService;
import dk.dtu.imm.fastmoney.CreditCardFaultMessage;
import dk.dtu.imm.fastmoney.types.AccountType;
import dk.dtu.imm.fastmoney.types.CreditCardInfoType;
import hotelreservationservices.CancelHotelFault;
import hotelreservationservices.CreditCardType;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(serviceName = "HotelReservationService", portName = "HotelReservationServicesBindingPort", endpointInterface = "hotelreservationservices.HotelReservationServices", targetNamespace = "http://HotelReservationServices", wsdlLocation = "WEB-INF/wsdl/HotelReservation/HotelReservation.wsdl")
public class HotelReservation {
 
    // -------- NiceView --------
    
    public hotelreservationservices.HotelsType getHotels(String city, XMLGregorianCalendar arrival, XMLGregorianCalendar departure) {

        throw new UnsupportedOperationException("Not implemented yet.");

    }

    public boolean bookHotel(int bookingNumber, CreditCardType creditCard) {
    
        throw new UnsupportedOperationException("Not implemented yet.");

    }

    public boolean cancelHotel(int bookingNumber) throws CancelHotelFault {
    
        throw new UnsupportedOperationException("Not implemented yet.");
 
    }

    // -------- FastMoney --------
    
    private BankService bank;

    private boolean chargeCreditCard(int group, CreditCardInfoType creditCard, int amount, AccountType account) throws CreditCardFaultMessage {
        
        return bank.getBankPort().chargeCreditCard(group, creditCard, amount, account);

    }

    private boolean refundCreditCard(int group, CreditCardInfoType creditCard, int amount, AccountType account) throws CreditCardFaultMessage {

        return bank.getBankPort().refundCreditCard(group, creditCard, amount, account);

    }

    private boolean validateCreditCard(int group, CreditCardInfoType creditCard, int amount) throws CreditCardFaultMessage {
      
        return bank.getBankPort().validateCreditCard(group, creditCard, amount);
    
    }
    
}