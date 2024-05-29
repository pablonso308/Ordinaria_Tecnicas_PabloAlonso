package Ejercicio3;

// IPOController.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class IPOController {
    private IPOProcess model;
    private IPOView view;

    public IPOController(IPOProcess model, IPOView view) {
        this.model = model;
        this.view = view;
        this.view.addAddDocumentButtonListener(new AddDocumentButtonListener());
        this.view.addAddRequirementButtonListener(new AddRequirementButtonListener());
        this.view.addAddMilestoneButtonListener(new AddMilestoneButtonListener());
        this.view.addAddSupplierButtonListener(new AddSupplierButtonListener());
        this.view.addAddInvestorButtonListener(new AddInvestorButtonListener());
    }

    class AddDocumentButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String title = view.getTitle();
            String type = view.getType();
            String content = view.getContent();
            Document document = new Document(title, type, content);
            model.addDocument(document);
            view.setOutput("Added Document: " + title);
        }
    }

    class AddRequirementButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String description = view.getContent();
            Requirement requirement = new Requirement(description);
            model.addRequirement(requirement);
            view.setOutput("Added Requirement: " + description);
        }
    }

    class AddMilestoneButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = view.getTitle();
            Date dueDate = new Date(); // Simplificación: usar la fecha actual
            Milestone milestone = new Milestone(name, dueDate);
            model.addMilestone(milestone);
            view.setOutput("Added Milestone: " + name);
        }
    }

    class AddSupplierButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = view.getTitle();
            String contactInfo = view.getContent();
            Stakeholder.Supplier supplier = new Stakeholder.Supplier(name, contactInfo);
            model.addSupplier(supplier);
            view.setOutput("Added Supplier: " + name);
        }
    }

    class AddInvestorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = view.getTitle();
            String contactInfo = view.getContent();
            Investor investor = new Investor(name, contactInfo);
            model.addInvestor(investor);
            view.setOutput("Added Investor: " + name);
        }
    }
}
