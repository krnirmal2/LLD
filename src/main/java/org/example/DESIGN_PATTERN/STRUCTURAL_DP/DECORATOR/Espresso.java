package org.example.DESIGN_PATTERN.STRUCTURAL_DP.DECORATOR;

//The concrete component is the actual coffee implementation, such as "Espresso" or "Latte."
public class Espresso implements Coffee{

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
