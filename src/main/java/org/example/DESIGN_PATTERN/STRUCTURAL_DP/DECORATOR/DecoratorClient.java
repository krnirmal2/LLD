package org.example.DESIGN_PATTERN.STRUCTURAL_DP.DECORATOR;

public class DecoratorClient{
    public static void main(String[] args) {
        // Order a plain espresso
        Coffee espresso = new Espresso();
        System.out.println("Order: " + espresso.getDescription());
        System.out.println("Cost: $" + espresso.getCost());

        // Order a latte with vanilla flavor
//        Coffee latte = new Latte();
//        latte = new VanillaDecorator(latte);
//        System.out.println("Order: " + latte.getDescription());
//        System.out.println("Cost: $" + latte.getCost());
    }
}
