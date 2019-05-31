
package session;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the session package. 
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

    private final static QName _Getproduct_QNAME = new QName("http://services/", "getproduct");
    private final static QName _GetproductResponse_QNAME = new QName("http://services/", "getproductResponse");
    private final static QName _Listing_QNAME = new QName("http://services/", "listing");
    private final static QName _ListingResponse_QNAME = new QName("http://services/", "listingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: session
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Getproduct }
     * 
     */
    public Getproduct createGetproduct() {
        return new Getproduct();
    }

    /**
     * Create an instance of {@link GetproductResponse }
     * 
     */
    public GetproductResponse createGetproductResponse() {
        return new GetproductResponse();
    }

    /**
     * Create an instance of {@link Listing }
     * 
     */
    public Listing createListing() {
        return new Listing();
    }

    /**
     * Create an instance of {@link ListingResponse }
     * 
     */
    public ListingResponse createListingResponse() {
        return new ListingResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Products_Type }
     * 
     */
    public Products_Type createProducts_Type() {
        return new Products_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getproduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getproduct")
    public JAXBElement<Getproduct> createGetproduct(Getproduct value) {
        return new JAXBElement<Getproduct>(_Getproduct_QNAME, Getproduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetproductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getproductResponse")
    public JAXBElement<GetproductResponse> createGetproductResponse(GetproductResponse value) {
        return new JAXBElement<GetproductResponse>(_GetproductResponse_QNAME, GetproductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listing")
    public JAXBElement<Listing> createListing(Listing value) {
        return new JAXBElement<Listing>(_Listing_QNAME, Listing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listingResponse")
    public JAXBElement<ListingResponse> createListingResponse(ListingResponse value) {
        return new JAXBElement<ListingResponse>(_ListingResponse_QNAME, ListingResponse.class, null, value);
    }

}
