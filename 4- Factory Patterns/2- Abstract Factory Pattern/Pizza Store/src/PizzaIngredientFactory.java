import java.util.List;

public interface PizzaIngredientFactory {

    String createDough();
    String createSauce();
    String createCheese();
    List<String> createVeggies();
    String createPepperoni();
    String createClam();
}
