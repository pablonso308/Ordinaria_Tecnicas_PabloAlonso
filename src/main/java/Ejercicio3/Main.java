package Ejercicio3;

// Main.java
public class Main {
    public static void main(String[] args) {
        IPOProcess model = new IPOProcess();
        IPOView view = new IPOView();
        IPOController controller = new IPOController(model, view);

        view.setVisible(true);
    }
}
