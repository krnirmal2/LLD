package org.example.DESIGN_PATTERN.BEHAVIORAL_DP.OBSERVER_DP;


/*Define the Subject interface: Create an interface called
        Subject that declares the methods for registering,
        removing, and notifying observers.
        /
 */

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
