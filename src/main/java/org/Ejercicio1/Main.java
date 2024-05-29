package org.Ejercicio1;

// Main.java
public class Main {
    public static void main(String[] args) {
        double bookValue = 1000000.0; // Ejemplo de valor en libros
        double totalShares = 500000.0; // Ejemplo de número total de acciones

        GlamourFinancial model = new GlamourFinancialImplementation(bookValue, totalShares);
        GlamourFinancialView view = new GlamourFinancialView();
        GlamourFinancialController controller = new GlamourFinancialController(model, view);

        view.setVisible(true);
    }
}

