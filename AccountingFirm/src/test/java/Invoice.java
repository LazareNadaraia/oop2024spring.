import java.io.Serializable;

public class Invoice implements Serializable {
    private int id;
    private String description;
    private double amount;

    public Invoice(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return id + "," + description + "," + amount;
    }

    public static Invoice fromString(String invoiceString) {
        String[] parts = invoiceString.split(",");
        int id = Integer.parseInt(parts[0]);
        String description = parts[1];
        double amount = Double.parseDouble(parts[2]);
        return new Invoice(id, description, amount);
    }
}