## Decorator Pattern — Pizza example (Structural)

This folder contains a small Java implementation of the Decorator pattern using pizzas and toppings.

## Overview

The Decorator pattern lets you add responsibilities to individual objects at runtime by wrapping them with decorator objects instead of using inheritance.

This example models pizzas as core components and toppings as decorators that add description and cost.

## Files and responsibilities

- `src/BasePizza.java` — Component interface. Declares `getDescription()` and `getCost()`.
- `src/PlainPizza.java` — A simple concrete pizza (base pizza).
- `src/Farmhouse.java` — A concrete pizza (farmhouse) with its own cost.
- `src/TandooriPaneerDelight.java` — Another concrete pizza variant.
- `src/ChickenDominator.java` — Another concrete pizza variant.
- `src/ToppingDecorator.java` — Abstract decorator that implements `BasePizza` and wraps another `BasePizza`.
- `src/ExtraCheeseTopping.java` — Concrete decorator that adds extra cheese.
- `src/MushroomTopping.java` — Concrete decorator that adds mushrooms.
- `src/PepperoniTopping.java` — Concrete decorator that adds pepperoni.
- `src/VeggiesTopping.java` — Concrete decorator that adds vegetables.

## Quick contract

- Inputs: a concrete `BasePizza` (one of the pizza classes) and zero or more topping decorators that wrap it.
- Outputs: `getDescription()` returns the combined description; `getCost()` returns the combined numeric cost (double).
- Error modes: none specific — these classes are plain value objects.

## Example usage (demo)

Create pizzas by wrapping a concrete pizza with any number of topping decorators. Order doesn't affect correctness but affects the composed description order.

Example (shown in `src/Main.java` in this folder):

```java
package DesignPatterns.Structural.Decorator.src;

public class Main {
	public static void main(String[] args) {
		BasePizza pizza = new ExtraCheeseTopping(
							new MushroomTopping(
								new Farmhouse()));

		System.out.println(pizza.getDescription());
		System.out.printf("Total cost: %.2f\n", pizza.getCost());
	}
}
```

Expected output (approx):

Farmhouse Pizza, Mushroom, Extra Cheese
Total cost: 360.00

(Farmhouse 300 + Mushroom 40 + Extra Cheese 20)

## How to compile & run (local)

From this folder (`DesignPatterns/Structural/Decorator`) run:

```bash
# compile all .java files into 'out' directory
javac -d out src/*.java

# run the demo Main
java -cp out DesignPatterns.Structural.Decorator.src.Main
```

Notes:
- The files declare package `DesignPatterns.Structural.Decorator.src`, so compile/run must use the package-qualified main class.
- If you prefer an IDE, import the project as a Java project and run `Main`.

## Edge cases and notes

- Wrapping the same topping multiple times is allowed (e.g., double cheese).
- Costs are simple doubles; for real money handling use a currency/BigDecimal.

## Small demo (created)

I added a small `Main.java` demo to `src/` that constructs a pizza with toppings and prints the description and total cost.

## Requirements coverage

- Update the README to reflect the concrete classes and usage: Done
- Provide a runnable demo showing how to compose decorators: Done (`src/Main.java`)

---

If you want, I can also:
- Add unit tests for the pricing logic (JUnit).
- Add more topping examples or make costs configurable.
