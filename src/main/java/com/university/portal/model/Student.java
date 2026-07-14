package com.university.portal.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String registrationNo;
    private final String name;
    private String password;
    private String email;
    private final Department department;
    private final List<Course> enrolledCourses;

    public Student(String registrationNo, String name, Department department, String email) {
        this.department = department;
        this.name = name;
        this.registrationNo = registrationNo;
        this.password = "jobail56224";
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     public void enrollInCourse(Course course) {
        if (course != null) {
            this.enrolledCourses.add(course);
            System.out.println(name + " successfully enrolled in: " + course.getCourseName());
        } else {
            System.out.println("Invalid Course! Cannot enroll.");
        }
    }

}
