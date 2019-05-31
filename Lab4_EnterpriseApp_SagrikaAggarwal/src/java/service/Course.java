/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author sagri
 */
public class Course {
     private int id;
    private String courseName;
    private String semester;

    public Course(int id, String courseName, String semester) {
        this.id = id;
        this.courseName = courseName;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSemester() {
        return semester;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
}
