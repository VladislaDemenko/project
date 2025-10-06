import java.util.List;
import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String phone;
    private String password;
    private double monthlyBudget;

    public User(String name, String email, String phone, String password, double monthlyBudget) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.monthlyBudget = monthlyBudget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public void setBudget(double amount) {
        if (amount >= 0) {
            this.monthlyBudget = amount;
        } else {
            throw new IllegalArgumentException("Бюджет не может быть отрицательным или содержать буквы.");
        }
    }

    public List<Establishment> getEstablishmentsByCategory(String category) {
        return null;
    }

    public Establishment chooseRandomEstablishment() {
        return null;
    }

    public void addVisitHistory(VisitHistory visit) {
        if (visit != null) {
            visitHistory.add(visit);
        }
    }

    public void leaveReview(Establishment establishment, int rating, String comment) {
        if (establishment != null && ValidationUtils.isRatingValid(rating)) {
            System.out.println("Отзыв оставлен для: " + establishment.getName());
        }
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }
}
