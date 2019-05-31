/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import clientB.WebServiceB_Service;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author sagri
 */
@WebService(serviceName = "WebServiceA")
public class WebServiceA {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "StudentDetails")
   
    public Student StudentDetails(@WebParam(name = "id") String id) {
        clientB.Student student = new clientB.Student();
        student.setId(id);
        student.setName("Sagrika");
        student.setSemester("4th");
        student = assigmCourse(student);
        List<clientB.Course> course = student.getCourse();
        Student s= new Student();
        s.setId(student.getId());
        s.setName(student.getName());
        s.setSemester(student.getSemester());
        for(clientB.Course c: course){
            Course c1 = new Course(c.getId(), c.getCourseName(), c.getSemester());
            s.addCourse(c1);
        }
        
        return s;
    }

    
     private static clientB.Student assigmCourse(clientB.Student student) {
        clientB.WebServiceB_Service service = new clientB.WebServiceB_Service();
        clientB.WebServiceB port = service.getWebServiceBPort();
        return port.assigmCourse(student);
    }
   
}
