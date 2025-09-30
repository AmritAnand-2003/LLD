package DesignPatterns.Structural.Decorator.src;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
