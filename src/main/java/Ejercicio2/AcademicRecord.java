package Ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class AcademicRecord {
    private Map<Subject, Double> grades;
    private Map<Subject, Boolean> certificates;

    public AcademicRecord() {
        this.grades = new HashMap<>();
        this.certificates = new HashMap<>();
    }

    public void addGrade(Subject subject, double grade) {
        grades.put(subject, grade);
    }

    public void addCertificate(Subject subject) {
        certificates.put(subject, true);
    }

    public double getGrade(Subject subject) {
        return grades.getOrDefault(subject, 0.0);
    }

    public boolean hasCertificate(Subject subject) {
        return certificates.getOrDefault(subject, false);
    }

    public double calculateAverageGrade() {
        return grades.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}
