package org.example.DESIGN_PATTERN.STRUCTURAL_DP.COMPOSITE;

import java.util.ArrayList;
import java.util.List;


//Implement the composite components: Create a class representing the departments in the organization. These
// composite components can contain both individual employees and sub-departments.
public class Department implements OrganizationComponent{
    private String name;
    private List<OrganizationComponent> components;

    public Department(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }
    public void addComponent(OrganizationComponent component) {
        components.add(component);
    }

    public void removeComponent(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Department: " + name);
        System.out.println("Components:");
        for (OrganizationComponent component : components) {
            component.display();
        }
    }
}
