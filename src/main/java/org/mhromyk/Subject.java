package org.mhromyk;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();
    public void measurementsChanged();

}
