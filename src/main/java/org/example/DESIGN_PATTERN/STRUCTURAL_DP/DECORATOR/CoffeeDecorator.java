package org.example.DESIGN_PATTERN.STRUCTURAL_DP.DECORATOR;


//’s say customers can add additional flavors
// or toppings to their coffee. We can use decorators to dynamically add these extras to the coffee.
public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public  CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
