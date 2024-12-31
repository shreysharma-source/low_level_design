package LLD.ObserverPattern.WeatherStation;

public class TVDisplayObserver implements Observer{

    public void update(int temp){
        System.out.println("Updating TV observer: Curr temp = " + temp);
    }
}
