package org.mhromyk.impl;

import org.mhromyk.Subject;
import org.mhromyk.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList = new ArrayList<Observer>();
    private float temperature;
    private float humidity;
    private float pressure;

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void registerObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this. humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void notifyAllObservers(){
        for ( Observer observer : observerList){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyAllObservers();
    }
}
