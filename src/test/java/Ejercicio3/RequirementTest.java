package Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RequirementTest {

    @Test
    public void testRequirementCreation() {
        Requirement req = new Requirement("Submit financial documents");
        assertEquals("Submit financial documents", req.getDescription());
        assertFalse(req.isCompleted());
    }

    @Test
    public void testMarkAsCompleted() {
        Requirement req = new Requirement("Submit financial documents");
        req.markAsCompleted();
        assertTrue(req.isCompleted());
    }
}
