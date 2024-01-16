package org.example.DESIGN_PATTERN.STRUCTURAL_DP.DECORATOR;


/*the base component is
 the "Coffee" interface, which represents the common functionality of all types of coffee.*/
public interface Coffee {
    String getDescription();
    double getCost();
}