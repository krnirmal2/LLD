package org.example.DESIGN_PATTERN.STRUCTURAL_DP.COMPOSITE;

// individual emplyoee in the organisation . this leaf component do not
// have any sub component
public class SingleEmployee implements OrganizationComponent {


    private String name;
    private String position;

    public SingleEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void display() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}
