
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Establishment {
    private String name;
    private String address;
    private String category;
    private String password;
    private double averageBill;
    private List<MenuItem> menu;
    private List<Promotion> promotions;

    public Establishment() {
        this.menu = new ArrayList<>();
        this.promotions = new ArrayList<>();
    }

    public Establishment(String name, String address, String category, String password, double averageBill) {
        this.name = name;
        this.address = address;
        this.category = category;
        this.password = password;
        this.averageBill = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MenuItem> getMenu() {
        return new ArrayList<>(menu);
    }

    public List<Promotion> getPromotions() {
        return new ArrayList<>(promotions);
    }




}
