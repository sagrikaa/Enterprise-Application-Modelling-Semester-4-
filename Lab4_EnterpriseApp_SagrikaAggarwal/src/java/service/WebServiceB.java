/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sagri
 */
@WebService(serviceName = "WebServiceB")
public class WebServiceB {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "assigmCourse")
    public Student assignCourse(@WebParam(name = "student") Student s) {
        
         Course c1 = new Course(1,"Enterprise App Modelling","4th");
        Course c2 = new Course(2,"Java ee","4th");
        s.addCourse(c1);
        s.addCourse(c2);
        return s;
        
    }
}
