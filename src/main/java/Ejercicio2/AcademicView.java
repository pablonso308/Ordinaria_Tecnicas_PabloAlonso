package Ejercicio2;
// AcademicView.java
import javax.swing.*;
import java.awt.event.ActionListener;

public class AcademicView extends JFrame {
    private JTextField employeeIdField;
    private JTextField courseTitleField;
    private JTextField subjectNameField;
    private JTextField gradeField;
    private JTextArea outputArea;
    private JButton enrollButton;
    private JButton addGradeButton;
    private JButton calculateAverageButton;
    private JButton addCertificateButton;

    public AcademicView() {
        setTitle("Glamour Academic System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        employeeIdField = new JTextField(10);
        courseTitleField = new JTextField(10);
        subjectNameField = new JTextField(10);
        gradeField = new JTextField(5);
        outputArea = new JTextArea(10, 40);
        enrollButton = new JButton("Enroll");
        addGradeButton = new JButton("Add Grade");
        calculateAverageButton = new JButton("Calculate Average");
        addCertificateButton = new JButton("Add Certificate");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Employee ID:"));
        panel.add(employeeIdField);
        panel.add(new JLabel("Course Title:"));
        panel.add(courseTitleField);
        panel.add(new JLabel("Subject Name:"));
        panel.add(subjectNameField);
        panel.add(new JLabel("Grade:"));
        panel.add(gradeField);
        panel.add(enrollButton);
        panel.add(addGradeButton);
        panel.add(calculateAverageButton);
        panel.add(addCertificateButton);
        panel.add(new JScrollPane(outputArea));

        add(panel);
    }

    public String getEmployeeId() {
        return employeeIdField.getText();
    }

    public String getCourseTitle() {
        return courseTitleField.getText();
    }

    public String getSubjectName() {
        return subjectNameField.getText();
    }

    public double getGrade() {
        return Double.parseDouble(gradeField.getText());
    }

    public void setOutput(String text) {
        outputArea.setText(text);
    }

    public void addEnrollButtonListener(ActionListener listener) {
        enrollButton.addActionListener(listener);
    }

    public void addAddGradeButtonListener(ActionListener listener) {
        addGradeButton.addActionListener(listener);
    }

    public void addCalculateAverageButtonListener(ActionListener listener) {
        calculateAverageButton.addActionListener(listener);
    }

    public void addAddCertificateButtonListener(ActionListener listener) {
        addCertificateButton.addActionListener(listener);
    }
}
