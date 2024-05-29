package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String id;
    private List<Course> enrolledCourses;
    private AcademicRecord academicRecord;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
        this.academicRecord = new AcademicRecord();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public AcademicRecord getAcademicRecord() {
        return academicRecord;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public double calculateAverageGrade() {
        return academicRecord.calculateAverageGrade();
    }
}