package org.mhromyk;

import org.mhromyk.impl.CurrentConditionDisplay;
import org.mhromyk.impl.WeatherData;

public class WeatherStation {

    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay currentConditionDisplay12 = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(28, 60, 95);
        weatherData.setMeasurements(32, 80, 95);
        currentConditionDisplay12.unsubscribe();
        weatherData.setMeasurements(22, 40, 90);


    }
}
