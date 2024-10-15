package assignment4_PizzaOrderingSystem;

public class VegetarianPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Vegetarian Pizza";
    }

    @Override
    public double getCost() {
        return 9;
    }
}
