package org.example.DESIGN_PATTERN.CREATIONAL_DP.PROTOTYPE_DP;

//Implement the prototype class: Create a concrete class
//that implements the prototype interface or extends the prototype
//abstract class. This class represents the predefined template for the business cards.

public class BusinessCardTemplate implements BusinessCardPrototype {
    private String name;
    private String companyName;
    private String email;

    public BusinessCardTemplate(String name, String companyName, String email) {
        this.name = name;
        this.companyName = companyName;
        this.email = email;
    }

    @Override
    public BusinessCardPrototype clone() {
        return new BusinessCardTemplate(name, companyName, email);
    }

    @Override
    public void display() {
        System.out.println("Business Card:");
        System.out.println("Name: " + name);
        System.out.println("Company: " + companyName);
        System.out.println("Email: " + email);
        System.out.println();
    }
}