package DesignPatterns.Structural.Decorator.src;

class PlainPizza implements BasePizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200.00;
    }
}
