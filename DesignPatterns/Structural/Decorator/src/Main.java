package DesignPatterns.Structural.Decorator.src;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheeseTopping(
                            new MushroomTopping(
                                new Farmhouse()));

        BasePizza pizza2 = new VeggiesTopping(
                            new PepperoniTopping(
                                new TandooriPaneerDelight()));

        BasePizza pizza3 = new ExtraCheeseTopping(new PlainPizza());

        System.out.println("Pizza 1: " + pizza1.getDescription());
        System.out.printf("Cost: %.2f\n\n", pizza1.getCost());

        System.out.println("Pizza 2: " + pizza2.getDescription());
        System.out.printf("Cost: %.2f\n\n", pizza2.getCost());

        System.out.println("Pizza 3: " + pizza3.getDescription());
        System.out.printf("Cost: %.2f\n", pizza3.getCost());
    }
}
