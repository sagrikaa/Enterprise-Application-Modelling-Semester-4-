/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sagri
 */
public class Student {
    private String id;
     private String name;
    private String semester;
    
    private List<Course> course = new ArrayList<>();

    public Student(){
        
    }
    
    public Student(String id, String name, String semester) {
        this.id = id;
        this.name = name;
        this.semester = semester;
    }
    
    public void addCourse(Course course){

        this.course.add(course);

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSemester() {
        return semester;
    }

    public List<Course> getCourse() {
        return course;
    }
  
    public List<Course> getCourses(){
        return course;
    }


   
  
      
}
