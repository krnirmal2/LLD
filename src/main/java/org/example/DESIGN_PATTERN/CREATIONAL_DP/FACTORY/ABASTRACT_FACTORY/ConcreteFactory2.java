package org.example.DESIGN_PATTERN.CREATIONAL_DP.FACTORY.ABASTRACT_FACTORY;

public class ConcreteFactory2 implements Abstract_Fctory{
    @Override
    public ProductA createProductA() {
       return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
