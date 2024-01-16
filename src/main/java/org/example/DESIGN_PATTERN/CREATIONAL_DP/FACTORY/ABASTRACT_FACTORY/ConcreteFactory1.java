package org.example.DESIGN_PATTERN.CREATIONAL_DP.FACTORY.ABASTRACT_FACTORY;

public class ConcreteFactory1 implements Abstract_Fctory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
