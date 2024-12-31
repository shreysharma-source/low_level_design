package LLD.DecoratorPattern.PizzaBillling;

public class Main {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraVeggiesDecorator(new ExtraCheeseDecorator(new Margerita()));

        System.out.println("Cost " + pizza.getCost());
    }
    
}
