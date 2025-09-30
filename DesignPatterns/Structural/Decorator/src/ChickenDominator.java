package DesignPatterns.Structural.Decorator.src;

public class ChickenDominator implements BasePizza {
    @Override
    public String getDescription() {
        return "Chicken Dominator Pizza";
    }

    @Override
    public double getCost() {
        return 500.00;
    }
}
