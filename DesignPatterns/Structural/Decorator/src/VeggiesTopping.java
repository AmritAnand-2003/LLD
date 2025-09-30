package DesignPatterns.Structural.Decorator.src;

public class VeggiesTopping extends ToppingDecorator {
    public VeggiesTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", Veggies";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 30;
    }
}
