package LLD.ObserverPattern.WeatherStation;

public class MobileDisplayObserver implements Observer{
    
    public void update(int temp){
        System.out.println("Updating Mobile observer: Curr temp = " + temp);
    }
}
