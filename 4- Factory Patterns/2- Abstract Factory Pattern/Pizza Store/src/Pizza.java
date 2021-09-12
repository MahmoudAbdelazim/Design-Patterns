import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> veggies;
    String cheese;
    String pepperoni;
    String clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 mintues at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " {" +
                "  dough: '" + dough + '\'' +
                ", sauce: '" + sauce + '\'' +
                ", veggies: " + veggies +
                ", cheese: '" + cheese + '\'' +
                ", pepperoni: '" + pepperoni + '\'' +
                ", clam: '" + clam + '\'' +
                '}';
    }
}
