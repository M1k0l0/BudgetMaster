import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private int monthlyBudget;
    private List<Spending> spendings;

    public User(String name, int monthlyBudget, List<Spending> spendings) {
        this.name = name;
        this.monthlyBudget = monthlyBudget;
        this.spendings = spendings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(int monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public List<Spending> getSpendings() {
        return spendings;
    }

    public void setSpendings(List<Spending> spendings) {
        this.spendings = spendings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return monthlyBudget == user.monthlyBudget && Objects.equals(name, user.name) && Objects.equals(spendings, user.spendings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, monthlyBudget, spendings);
    }


    public void newSpending(Spending spending){
        spendings.add(spending);
    }

    public void getSpendingByDate(LocalDate date){
        List<Spending> newSpending = new ArrayList();
        for (Spending spending : spendings) {
            if (spending.getDate().equals(date)){
                newSpending.add(spending);
            }
        }
        System.out.println(newSpending);;
    }

    public void totalSpending(){}


    public void getExpenseByCategory(Category category) {
        List<Spending> spend = new ArrayList<>();
        for(Spending spending : spendings) {
            if(spending.equals(category)) {
                spend.add(spending);
            }
        }
        System.out.println(spend);;
    }
}
