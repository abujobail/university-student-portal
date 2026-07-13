package com.university.portal.model;

/**
 * Represents a Course entity in the University Portal system.
 */
public class Course {
    // Declaring private final variables for security; these cannot be changed after creation
    private final String courseName;
    private final String courseCode;
    // This is not final because we might validate or adjust it during object creation
    private double credit;

    /**
     * Constructor to initialize the Course object with data validation.
     */
    public Course(String courseCode, String courseName, double credit) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        // Validation: Credits must be a positive number greater than zero
        if (credit <= 0) {
            System.out.println("credit is not less than zero or equal");
            this.credit = 3.0;// Setting a safe default backup value to prevent 0.0 in memory
        } else {
            this.credit = credit;// Assigning the valid user input to the class variable
        }
    }

    /**
     * Getter method to safely read the private courseCode.
     */
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredit() {
        return credit;
    }

    /**
     * Overriding toString() to return a human-readable summary of the object,
     * which is extremely helpful for debugging and testing.
     */
    @Override
    public String toString() {
        return "Course Info ->Code : " + courseCode + " | name : " + courseName + " | Credit: " + credit + " ";
    }
}
