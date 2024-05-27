import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountingFirm {
    private List<Invoice> invoices;

    public AccountingFirm() {
        this.invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public void removeInvoice(Invoice invoice) {
        invoices.remove(invoice);
    }

    public void saveState() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("state.csv"))) {
            for (Invoice invoice : invoices) {
                writer.write(invoice.toString());
                writer.newLine();
            }
        }
    }

    public void restoreState() throws IOException {
        invoices.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("state.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Invoice invoice = Invoice.fromString(line);
                invoices.add(invoice);
            }
        }
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public static void main(String[] args) {
        AccountingFirm firm = new AccountingFirm();
        firm.addInvoice(new Invoice(1, "Consulting", 1000.00));
        firm.addInvoice(new Invoice(2, "Audit", 1500.00));

        try {
            firm.saveState();
            firm.restoreState();
            for (Invoice invoice : firm.getInvoices()) {
                System.out.println(invoice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}