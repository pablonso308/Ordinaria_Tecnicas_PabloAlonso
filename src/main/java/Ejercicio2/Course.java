package Ejercicio2;

public class Course {
    private String title;
    private Subject subject;
    private String instructor;

    public Course(String title, Subject subject, String instructor) {
        this.title = title;
        this.subject = subject;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public Subject getSubject() {
        return subject;
    }

    public String getInstructor() {
        return instructor;
    }
}
