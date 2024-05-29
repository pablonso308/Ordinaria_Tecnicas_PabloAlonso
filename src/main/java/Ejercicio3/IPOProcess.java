package Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class IPOProcess {
    private List<Document> documents;
    private List<Requirement> requirements;
    private List<Milestone> milestones;
    private List<Stakeholder.Supplier> suppliers;
    private List<Stakeholder.Investor> investors;

    public IPOProcess() {
        this.documents = new ArrayList<>();
        this.requirements = new ArrayList<>();
        this.milestones = new ArrayList<>();
        this.suppliers = new ArrayList<>();
        this.investors = new ArrayList<>();
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void addRequirement(Requirement requirement) {
        requirements.add(requirement);
    }

    public void addMilestone(Milestone milestone) {
        milestones.add(milestone);
    }

    public void addSupplier(Stakeholder.Supplier supplier) {
        suppliers.add(supplier);
    }

    public void addInvestor(Stakeholder.Investor investor) {
        investors.add(investor);
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public List<Milestone> getMilestones() {
        return milestones;
    }

    public List<Stakeholder.Supplier> getSuppliers() {
        return suppliers;
    }

    public List<Stakeholder.Investor> getInvestors() {
        return investors;
    }
}