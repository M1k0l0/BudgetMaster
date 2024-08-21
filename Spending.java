import java.time.LocalDate;
import java.util.Objects;

public class Spending {
    private String description;
    private double amount;
    private Category category;
    private LocalDate date;

    public Spending(String description, double amount, Category category, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spending spending = (Spending) o;
        return Double.compare(amount, spending.amount) == 0 && Objects.equals(description, spending.description) && category == spending.category && Objects.equals(date, spending.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, amount, category, date);
    }

    public Category getTopCategory(){

    }
}