
package hotelreservationservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hotelreservationservices package. 
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

    private final static QName _Fault_QNAME = new QName("http://HotelReservationServices", "fault");
    private final static QName _HotelsNameElement_QNAME = new QName("http://HotelReservationServices", "hotelsNameElement");
    private final static QName _CreditcardInformationElement_QNAME = new QName("http://HotelReservationServices", "creditcardInformationElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hotelreservationservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditcardInformationType }
     * 
     */
    public CreditcardInformationType createCreditcardInformationType() {
        return new CreditcardInformationType();
    }

    /**
     * Create an instance of {@link HotelsNameType }
     * 
     */
    public HotelsNameType createHotelsNameType() {
        return new HotelsNameType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HotelReservationServices", name = "fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelsNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HotelReservationServices", name = "hotelsNameElement")
    public JAXBElement<HotelsNameType> createHotelsNameElement(HotelsNameType value) {
        return new JAXBElement<HotelsNameType>(_HotelsNameElement_QNAME, HotelsNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditcardInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HotelReservationServices", name = "creditcardInformationElement")
    public JAXBElement<CreditcardInformationType> createCreditcardInformationElement(CreditcardInformationType value) {
        return new JAXBElement<CreditcardInformationType>(_CreditcardInformationElement_QNAME, CreditcardInformationType.class, null, value);
    }

}
