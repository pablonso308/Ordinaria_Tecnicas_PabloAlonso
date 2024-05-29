package Ejercicio3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DocumentTest {

    @Test
    public void testDocumentCreation() {
        Document doc = new Document("Financial Report", "Financial", "Content of the financial report");
        assertEquals("Financial Report", doc.getTitle());
        assertEquals("Financial", doc.getType());
        assertEquals("Content of the financial report", doc.getContent());
    }
}
