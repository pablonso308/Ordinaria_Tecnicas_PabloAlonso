package Ejercicio3;

import javax.swing.*;
import java.awt.event.ActionListener;

public class IPOView extends JFrame {
    private JTextField titleField;
    private JTextField typeField;
    private JTextArea contentArea;
    private JTextArea outputArea;
    private JButton addDocumentButton;
    private JButton addRequirementButton;
    private JButton addMilestoneButton;
    private JButton addSupplierButton;
    private JButton addInvestorButton;

    public IPOView() {
        setTitle("Glamour Beauty IPO Management");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        titleField = new JTextField(10);
        typeField = new JTextField(10);
        contentArea = new JTextArea(5, 30);
        outputArea = new JTextArea(10, 40);
        addDocumentButton = new JButton("Add Document");
        addRequirementButton = new JButton("Add Requirement");
        addMilestoneButton = new JButton("Add Milestone");
        addSupplierButton = new JButton("Add Supplier");
        addInvestorButton = new JButton("Add Investor");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Type:"));
        panel.add(typeField);
        panel.add(new JLabel("Content:"));
        panel.add(new JScrollPane(contentArea));
        panel.add(addDocumentButton);
        panel.add(addRequirementButton);
        panel.add(addMilestoneButton);
        panel.add(addSupplierButton);
        panel.add(addInvestorButton);
        panel.add(new JScrollPane(outputArea));

        add(panel);
    }

    public String getTitle() {
        return titleField.getText();
    }

    public String getType() {
        return typeField.getText();
    }

    public String getContent() {
        return contentArea.getText();
    }

    public void setOutput(String text) {
        outputArea.setText(text);
    }

    public void addAddDocumentButtonListener(ActionListener listener) {
        addDocumentButton.addActionListener(listener);
    }

    public void addAddRequirementButtonListener(ActionListener listener) {
        addRequirementButton.addActionListener(listener);
    }

    public void addAddMilestoneButtonListener(ActionListener listener) {
        addMilestoneButton.addActionListener(listener);
    }

    public void addAddSupplierButtonListener(ActionListener listener) {
        addSupplierButton.addActionListener(listener);
    }

    public void addAddInvestorButtonListener(ActionListener listener) {
        addInvestorButton.addActionListener(listener);
    }
}
