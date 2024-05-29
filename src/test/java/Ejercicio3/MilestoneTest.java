package Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class MilestoneTest {

    @Test
    public void testMilestoneCreation() {
        Date dueDate = new Date();
        Milestone milestone = new Milestone("Initial IPO Meeting", dueDate);
        assertEquals("Initial IPO Meeting", milestone.getName());
        assertEquals(dueDate, milestone.getDueDate());
        assertFalse(milestone.isCompleted());
    }

    @Test
    public void testMarkAsCompleted() {
        Milestone milestone = new Milestone("Initial IPO Meeting", new Date());
        milestone.markAsCompleted();
        assertTrue(milestone.isCompleted());
    }
}
