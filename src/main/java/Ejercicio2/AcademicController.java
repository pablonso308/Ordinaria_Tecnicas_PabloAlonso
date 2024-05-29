package Ejercicio2;

// AcademicController.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class AcademicController {
    private Map<String, Employee> employees;
    private Map<String, Course> courses;
    private Map<String, Subject> subjects;
    private AcademicView view;

    public AcademicController(AcademicView view) {
        this.view = view;
        this.employees = new HashMap<>();
        this.courses = new HashMap<>();
        this.subjects = new HashMap<>();

        // Populate with some sample data
        subjects.put("Math", new Subject("Math", 3));
        subjects.put("Science", new Subject("Science", 4));

        courses.put("Math101", new Course("Math101", subjects.get("Math"), "Prof. Smith"));
        courses.put("Science101", new Course("Science101", subjects.get("Science"), "Prof. Johnson"));

        employees.put("E001", new Employee("Alice", "E001"));
        employees.put("E002", new Employee("Bob", "E002"));

        this.view.addEnrollButtonListener(new EnrollButtonListener());
        this.view.addAddGradeButtonListener(new AddGradeButtonListener());
        this.view.addCalculateAverageButtonListener(new CalculateAverageButtonListener());
        this.view.addAddCertificateButtonListener(new AddCertificateButtonListener());
    }

    class EnrollButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String employeeId = view.getEmployeeId();
            String courseTitle = view.getCourseTitle();
            Employee employee = employees.get(employeeId);
            Course course = courses.get(courseTitle);
            if (employee != null && course != null) {
                employee.enrollCourse(course);
                view.setOutput("Enrolled " + employee.getName() + " in " + course.getTitle());
            } else {
                view.setOutput("Invalid employee ID or course title");
            }
        }
    }

    class AddGradeButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String employeeId = view.getEmployeeId();
            String subjectName = view.getSubjectName();
            double grade = view.getGrade();
            Employee employee = employees.get(employeeId);
            Subject subject = subjects.get(subjectName);
            if (employee != null && subject != null) {
                employee.getAcademicRecord().addGrade(subject, grade);
                view.setOutput("Added grade " + grade + " for " + subjectName + " to " + employee.getName());
            } else {
                view.setOutput("Invalid employee ID or subject name");
            }
        }
    }

    class CalculateAverageButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String employeeId = view.getEmployeeId();
            Employee employee = employees.get(employeeId);
            if (employee != null) {
                double average = employee.calculateAverageGrade();
                view.setOutput("Average grade for " + employee.getName() + ": " + average);
            } else {
                view.setOutput("Invalid employee ID");
            }
        }
    }

    class AddCertificateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String employeeId = view.getEmployeeId();
            String subjectName = view.getSubjectName();
            Employee employee = employees.get(employeeId);
            Subject subject = subjects.get(subjectName);
            if (employee != null && subject != null) {
                employee.getAcademicRecord().addCertificate(subject);
                view.setOutput("Added certificate for " + subjectName + " to " + employee.getName());
            } else {
                view.setOutput("Invalid employee ID or subject name");
            }
        }
    }
}
