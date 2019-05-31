
package clientB;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientB package. 
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

    private final static QName _AssigmCourse_QNAME = new QName("http://service/", "assigmCourse");
    private final static QName _AssigmCourseResponse_QNAME = new QName("http://service/", "assigmCourseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientB
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssigmCourse }
     * 
     */
    public AssigmCourse createAssigmCourse() {
        return new AssigmCourse();
    }

    /**
     * Create an instance of {@link AssigmCourseResponse }
     * 
     */
    public AssigmCourseResponse createAssigmCourseResponse() {
        return new AssigmCourseResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AssigmCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "assigmCourse")
    public JAXBElement<AssigmCourse> createAssigmCourse(AssigmCourse value) {
        return new JAXBElement<AssigmCourse>(_AssigmCourse_QNAME, AssigmCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssigmCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "assigmCourseResponse")
    public JAXBElement<AssigmCourseResponse> createAssigmCourseResponse(AssigmCourseResponse value) {
        return new JAXBElement<AssigmCourseResponse>(_AssigmCourseResponse_QNAME, AssigmCourseResponse.class, null, value);
    }

}
