package LLD.ObserverPattern.WeatherStation;

public class Main {

    public static void main(String[] args) {
        Observer mobile1 = new MobileDisplayObserver();
        Observer tv1 = new TVDisplayObserver();

        WSObservable weatherStation = new WSObservable();
        weatherStation.add(mobile1);
        weatherStation.add(tv1);

        weatherStation.setCurrTemp(32);
    }
    
}
