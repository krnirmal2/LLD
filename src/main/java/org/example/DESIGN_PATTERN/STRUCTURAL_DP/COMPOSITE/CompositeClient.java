package org.example.DESIGN_PATTERN.STRUCTURAL_DP.COMPOSITE;

public class CompositeClient {
//    Use the composite: In the client code, create instances of individual employees
//    and departments, and compose them into the organizational hierarchy.

    public static void main(String[] args) {
        // Create individual employees
        SingleEmployee emp1 = new SingleEmployee("John Doe", "Developer");
        SingleEmployee emp2 = new SingleEmployee("Jane Smith", "Manager");

        // Create departments
        Department department1 = new Department("Engineering");
        Department department2 = new Department("Sales");

        // Compose the organizational hierarchy
        department1.addComponent(emp1);
        department1.addComponent(emp2);
        department2.addComponent(new SingleEmployee("Alice Johnson", "Salesperson"));
        department2.addComponent(new SingleEmployee("Bob Williams", "Salesperson"));
        department2.addComponent(new SingleEmployee("Charlie Brown", "Salesperson"));

        // Display the organizational hierarchy
        department1.display();
        department2.display();
    }
}
