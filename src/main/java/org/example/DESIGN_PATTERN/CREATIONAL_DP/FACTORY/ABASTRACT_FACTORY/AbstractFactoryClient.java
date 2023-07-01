package org.example.DESIGN_PATTERN.CREATIONAL_DP.FACTORY.ABASTRACT_FACTORY;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Abstract_Fctory factory1 =  new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        productA1.doSomething();
        productB1.doSomething();

        Abstract_Fctory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA2.doSomething();
        productB2.doSomething();
    }



        }
