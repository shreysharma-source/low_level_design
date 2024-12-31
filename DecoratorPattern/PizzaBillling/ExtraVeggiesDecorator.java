package LLD.DecoratorPattern.PizzaBillling;

public class ExtraVeggiesDecorator extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraVeggiesDecorator(BasePizza iPizza){
        this.basePizza = iPizza;
    }

    public int getCost(){
        return this.basePizza.getCost() + 60;
    }

    
}
