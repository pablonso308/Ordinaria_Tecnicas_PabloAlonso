package org.Ejercicio1;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GlamourFinancialView extends JFrame {
    private JTextField marketField;
    private JTextField priceField;
    private JTextArea outputArea;
    private JButton updateButton;
    private JButton calculateButton;

    public GlamourFinancialView() {
        setTitle("Glamour Financial");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        marketField = new JTextField(10);
        priceField = new JTextField(10);
        outputArea = new JTextArea(10, 30);
        updateButton = new JButton("Update Price");
        calculateButton = new JButton("Calculate Values");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Market:"));
        panel.add(marketField);
        panel.add(new JLabel("Price:"));
        panel.add(priceField);
        panel.add(updateButton);
        panel.add(calculateButton);
        panel.add(new JScrollPane(outputArea));

        add(panel);
    }

    public String getMarket() {
        return marketField.getText();
    }

    public double getPrice() {
        return Double.parseDouble(priceField.getText());
    }

    public void setOutput(String text) {
        outputArea.setText(text);
    }

    public void addUpdateButtonListener(ActionListener listener) {
        updateButton.addActionListener(listener);
    }

    public void addCalculateButtonListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
}
