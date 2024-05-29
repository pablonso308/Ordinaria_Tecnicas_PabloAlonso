package Ejercicio3;

import java.util.Date;

public class Milestone {
    private String name;
    private Date dueDate;
    private boolean completed;

    public Milestone(String name, Date dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }
}