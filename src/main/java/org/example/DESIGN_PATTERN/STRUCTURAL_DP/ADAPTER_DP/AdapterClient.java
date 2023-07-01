package org.example.DESIGN_PATTERN.STRUCTURAL_DP.ADAPTER_DP;

public class AdapterClient {
    public static void main(String[] args) {
        // Incompatible power outlet
        ForeignPowerOutlet foreignPowerOutlet = new ForeignPowerOutlet();

        // Create the adapter
        PowerOutletAdapter adapter = new PowerOutletAdapter(foreignPowerOutlet);

        // Connect electronic devices to the power outlet using the adapter
        connectToDevice(adapter);
    }

    public static void connectToDevice(PowerOutlet powerOutlet) {
        powerOutlet.provideElectricity();
    }
}
