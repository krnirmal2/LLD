package org.example.DESIGN_PATTERN.CREATIONAL_DP.PROTOTYPE_DP;

public class PrototypeClient {
    public static void main(String[] args) {
        // Create the prototype
        BusinessCardPrototype template = new BusinessCardTemplate("John Doe", "ABC Company", "john.doe@abc.com");

        // Create personalized cards by cloning the prototype
        BusinessCardPrototype card1 = template.clone();
        card1.display();

        BusinessCardPrototype card2 = template.clone();
        card2.display();

        // Modify the cloned cards to make them personalized
        card1 = template.clone();
//        ((BusinessCardTemplate) card1).setName("Jane Smith");
//        ((BusinessCardTemplate) card1).setCompanyName("XYZ Corporation");
//        ((BusinessCardTemplate) card1).setEmail("jane.smith@xyz.com");
//        card1.display();
//
//        card2 = template.clone();
//        ((BusinessCardTemplate) card2).setName("Bob Johnson");
//        ((BusinessCardTemplate) card2).setCompanyName("DEF Industries");
//        ((BusinessCardTemplate) card2).setEmail("bob.johnson@def.com");
        card2.display();
    }
}
