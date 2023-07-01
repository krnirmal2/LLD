package org.example.DESIGN_PATTERN.STRUCTURAL_DP.ADAPTER_DP;

//Create the Adapter: Implement an adapter class that implements the target interface and wraps
// the incompatible object. This adapter class translates the calls from the target interface to the appropriate calls on the adaptee.
public class PowerOutletAdapter implements PowerOutlet {
    private ForeignPowerOutlet foreignPowerOutlet;

    public PowerOutletAdapter(ForeignPowerOutlet foreignPowerOutlet) {
        this.foreignPowerOutlet = foreignPowerOutlet;
    }

    @Override
    public void provideElectricity() {
        foreignPowerOutlet.giveElectricity();
    }
}