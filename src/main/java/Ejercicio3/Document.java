package Ejercicio3;

public class Document {
    private String title;
    private String type; // Legal, Financial, Operational
    private String content;

    public Document(String title, String type, String content) {
        this.title = title;
        this.type = type;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}