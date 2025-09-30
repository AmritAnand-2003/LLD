package DesignPatterns.Structural.Decorator.src;

public class PepperoniTopping extends ToppingDecorator {
    public PepperoniTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", Pepperoni Topping";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 30.00;
    }
    
}
