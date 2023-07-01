package org.example.DESIGN_PATTERN.CREATIONAL_DP.FACTORY.FACTORY_DP;

public class Factory {
    public ProductFactoryDP creatProduct(String type){
        if (type.equalsIgnoreCase("Product1")) {
            return new ConcreateProduct1FactoryDP();
        } else if (type.equalsIgnoreCase("Product2")) {
            return new ConcreateProduct2FactoryDP();
        }
        return null; // Return null or throw an exception for unknown types
    }

}

