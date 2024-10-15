package assignment4_PizzaOrderingSystem;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza myPizza = new MargheritaPizza();
        myPizza = new CheeseTopping(myPizza);
        myPizza = new PepperoniTopping(myPizza);

        System.out.println("Pizza description: " + myPizza.getDescription());
        System.out.println("Pizza cost: $" + myPizza.getCost());
    }
}
