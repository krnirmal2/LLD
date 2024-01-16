package org.example.DESIGN_PATTERN.BEHAVIORAL_DP.OBSERVER_DP;


/*Consider the scenario of a weather
monitoring application where multiple displays need to b
e updated whenever the weather conditions change.
The Observer pattern can be applied to achieve this functionality.
Here's how the Observer pattern can be used in this scenario:
*/
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}

