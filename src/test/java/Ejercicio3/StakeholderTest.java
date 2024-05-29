package Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SupplierInvestorTest {

    @Test
    public void testSupplierCreation() {
        Supplier supplier = new Supplier("ABC Supplies", "contact@abc.com");
        assertEquals("ABC Supplies", supplier.getName());
        assertEquals("contact@abc.com", supplier.getContactInfo());
    }

    @Test
    public void testInvestorCreation() {
        Investor investor = new Investor("John Doe", "john@doe.com");
        assertEquals("John Doe", investor.getName());
        assertEquals("john@doe.com", investor.getContactInfo());
    }
}
