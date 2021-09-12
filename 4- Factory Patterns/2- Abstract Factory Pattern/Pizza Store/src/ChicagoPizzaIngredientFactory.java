import java.util.ArrayList;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "Thick Crust Dough";
    }

    @Override
    public String createSauce() {
        return "Plum Tomato Sauce";
    }

    @Override
    public String createCheese() {
        return "Mozzarella Cheese";
    }

    @Override
    public List<String> createVeggies() {
        List<String> veggies = new ArrayList<>();
        veggies.add("Black Olives");
        veggies.add("Spinach");
        veggies.add("Egg Plant");
        return veggies;
    }

    @Override
    public String createPepperoni() {
        return "Sliced Pepperoni";
    }

    @Override
    public String createClam() {
        return "Frozen Clams";
    }
}
