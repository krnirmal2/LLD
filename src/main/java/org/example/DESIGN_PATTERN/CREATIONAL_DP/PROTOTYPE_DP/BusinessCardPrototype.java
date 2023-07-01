package org.example.DESIGN_PATTERN.CREATIONAL_DP.PROTOTYPE_DP;

//Define the prototype interface or abstract class:
// Create an interface or abstract class that declares a method for cloning the prototype object.
public interface BusinessCardPrototype {
    BusinessCardPrototype clone();
    void display();
}
