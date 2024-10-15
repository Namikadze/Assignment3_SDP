package assignment4_PizzaOrderingSystem;

public class PepperoniTopping extends ToppingDecorator {
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 2;
    }
}
