package LLD.ObserverPattern.WeatherStation;

public interface Observable {

    public void add(Observer obs);

    public void remove(Observer obs);

    public void notify(int temp);

}
