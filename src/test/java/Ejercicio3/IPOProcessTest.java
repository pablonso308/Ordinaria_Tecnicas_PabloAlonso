package Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class IPOProcessTest {

    @Test
    public void testIPOProcess() {
        IPOProcess ipoProcess = new IPOProcess();

        Document doc = new Document("Financial Report", "Financial", "Content of the financial report");
        ipoProcess.addDocument(doc);
        assertEquals(1, ipoProcess.getDocuments().size());
        assertEquals(doc, ipoProcess.getDocuments().get(0));

        Requirement req = new Requirement("Submit financial documents");
        ipoProcess.addRequirement(req);
        assertEquals(1, ipoProcess.getRequirements().size());
        assertEquals(req, ipoProcess.getRequirements().get(0));

        Milestone milestone = new Milestone("Initial IPO Meeting", new Date());
        ipoProcess.addMilestone(milestone);
        assertEquals(1, ipoProcess.getMilestones().size());
        assertEquals(milestone, ipoProcess.getMilestones().get(0));

        Supplier supplier = new Supplier("ABC Supplies", "contact@abc.com");
        ipoProcess.addSupplier(supplier);
        assertEquals(1, ipoProcess.getSuppliers().size());
        assertEquals(supplier, ipoProcess.getSuppliers().get(0));

        Investor investor = new Investor("John Doe", "john@doe.com");
        ipoProcess.addInvestor(investor);
        assertEquals(1, ipoProcess.getInvestors().size());
        assertEquals(investor, ipoProcess.getInvestors().get(0));
    }
}
