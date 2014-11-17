package ws;

import dk.dtu.imm.fastmoney.BankService;
import dk.dtu.imm.fastmoney.CreditCardFaultMessage;
import hotelreservationservices.CancelHotelFault;
import hotelreservationservices.CreditCardType;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(serviceName = "HotelReservationService", portName = "HotelReservationServicesBindingPort", endpointInterface = "hotelreservationservices.HotelReservationServices", targetNamespace = "http://HotelReservationServices", wsdlLocation = "WEB-INF/wsdl/HotelReservation/HotelReservation.wsdl")
public class HotelReservation {
    
    private BankService bank;

    public hotelreservationservices.HotelsType getHotels(String city, XMLGregorianCalendar arrival, XMLGregorianCalendar departure) {

        throw new UnsupportedOperationException("Not implemented yet.");

    }

    public boolean bookHotel(int bookingNumber, CreditCardType creditCard) {
    
        throw new UnsupportedOperationException("Not implemented yet.");

    }

    public boolean cancelHotel(int bookingNumber) throws CancelHotelFault {
    
        throw new UnsupportedOperationException("Not implemented yet.");
 
    }

    private boolean chargeCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankPortType port = bank.getBankPort();
        return port.chargeCreditCard(group, creditCardInfo, amount, account);
    }

    private boolean refundCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankPortType port = bank.getBankPort();
        return port.refundCreditCard(group, creditCardInfo, amount, account);
    }

    private boolean validateCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount) throws CreditCardFaultMessage {
        dk.dtu.imm.fastmoney.BankPortType port = bank.getBankPort();
        return port.validateCreditCard(group, creditCardInfo, amount);
    }
    
}