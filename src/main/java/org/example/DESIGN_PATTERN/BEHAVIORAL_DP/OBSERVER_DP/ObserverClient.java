package org.example.DESIGN_PATTERN.BEHAVIORAL_DP.OBSERVER_DP;

public class ObserverClient {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(conditionsDisplay);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setMeasurements(75, 60, 30.4f);

        // Output:
        // Current conditions: 75F degrees and 60% humidity
        // Weather forecast: Pressure is 30.4
    }
}
