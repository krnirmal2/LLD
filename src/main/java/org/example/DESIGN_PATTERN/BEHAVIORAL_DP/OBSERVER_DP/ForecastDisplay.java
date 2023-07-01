package org.example.DESIGN_PATTERN.BEHAVIORAL_DP.OBSERVER_DP;

public class ForecastDisplay implements Observer {
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Weather forecast: Pressure is " + pressure);
    }
}