
package clientA;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientA package. 
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

    private final static QName _StudentDetails_QNAME = new QName("http://service/", "StudentDetails");
    private final static QName _StudentDetailsResponse_QNAME = new QName("http://service/", "StudentDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientA
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudentDetails }
     * 
     */
    public StudentDetails createStudentDetails() {
        return new StudentDetails();
    }

    /**
     * Create an instance of {@link StudentDetailsResponse }
     * 
     */
    public StudentDetailsResponse createStudentDetailsResponse() {
        return new StudentDetailsResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "StudentDetails")
    public JAXBElement<StudentDetails> createStudentDetails(StudentDetails value) {
        return new JAXBElement<StudentDetails>(_StudentDetails_QNAME, StudentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "StudentDetailsResponse")
    public JAXBElement<StudentDetailsResponse> createStudentDetailsResponse(StudentDetailsResponse value) {
        return new JAXBElement<StudentDetailsResponse>(_StudentDetailsResponse_QNAME, StudentDetailsResponse.class, null, value);
    }

}
