
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


}
