import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tasting dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for  (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Baking pizza for 15 minutes at 250°C");
    }

    void cut() {
        System.out.println("Cutting pizza into 8 even slices");
    }

    void box() {
        System.out.println("Boxing pizza");
    }

    public String getName() {
        return name;
    }
}
