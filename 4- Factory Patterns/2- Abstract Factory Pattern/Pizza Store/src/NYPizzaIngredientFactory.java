import java.util.ArrayList;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "Thin Crust Dough";
    }

    @Override
    public String createSauce() {
        return "Marinara Sauce";
    }

    @Override
    public String createCheese() {
        return "Reggiano Cheese";
    }

    @Override
    public List<String> createVeggies() {
        List<String> veggies = new ArrayList<>();
        veggies.add("Garlic");
        veggies.add("Onion");
        veggies.add("Mushroom");
        veggies.add("RedPepper");
        return veggies;
    }

    @Override
    public String createPepperoni() {
        return "Sliced Pepperoni";
    }

    @Override
    public String createClam() {
        return "Fresh Clams";
    }
}
