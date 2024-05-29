package Ejercicio3;
public abstract class Stakeholder {
    protected String name;
    protected String contactInfo;

    public Stakeholder(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }


    // Supplier.java
    public class Supplier extends Stakeholder {
        public Supplier(String name, String contactInfo) {
            super(name, contactInfo);
        }
    }

    public static class Investor extends Stakeholder {
        public Investor(String name, String contactInfo) {
            super(name, contactInfo);
        }
    }

}