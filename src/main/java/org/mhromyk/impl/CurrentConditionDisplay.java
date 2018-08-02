package org.mhromyk.impl;

import org.mhromyk.Display;
import org.mhromyk.Observer;
import org.mhromyk.Subject;

public class CurrentConditionDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weather;

    public CurrentConditionDisplay(Subject weather){
        this.weather = weather;
        weather.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure ){
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
            show();
    }

    public void unsubscribe(){
        weather.removeObserver(this);
    }

    public void show(){
        System.out.println("CurrentCondition status:");
        System.out.println("    Temperature: "+temperature);
        System.out.println("    Humidity: "+humidity);
        System.out.println("    Pressure: "+pressure);

    }
}
