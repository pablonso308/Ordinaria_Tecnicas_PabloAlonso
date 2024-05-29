package Ejercicio2;

// Main.java
public class Main {
    public static void main(String[] args) {
        AcademicView view = new AcademicView();
        AcademicController controller = new AcademicController(view);

        view.setVisible(true);
    }
}
