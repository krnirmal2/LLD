package org.example.DESIGN_PATTERN.STRUCTURAL_DP.DECORATOR;

public class VanillaDecorator extends CoffeeDecorator {
    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Vanilla";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}