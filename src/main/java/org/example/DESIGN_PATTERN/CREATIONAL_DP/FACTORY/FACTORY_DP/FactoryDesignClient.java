package org.example.DESIGN_PATTERN.CREATIONAL_DP.FACTORY.FACTORY_DP;

import org.example.DESIGN_PATTERN.CREATIONAL_DP.FACTORY.FACTORY_DP.Factory;
import org.example.DESIGN_PATTERN.CREATIONAL_DP.FACTORY.FACTORY_DP.ProductFactoryDP;

public class FactoryDesignClient {

    public static void main(String[] args) {
        Factory factory = new Factory();

        // create concreate product 1
        ProductFactoryDP product1 = factory.creatProduct("Product1");
        product1.productFactoryInterFace();

// create concreate product 2
        ProductFactoryDP product2 = factory.creatProduct("Product2");
        product2.productFactoryInterFace();


    }
}
