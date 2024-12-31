package LLD.DecoratorPattern.PizzaBillling;

public class ExtraCheeseDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheeseDecorator(BasePizza iPizza){
        this.basePizza = iPizza;
    }

    public int getCost(){
        return this.basePizza.getCost() + 50;
    }
    
}
