package LLD.ObserverPattern.Generic;

// import LLD.ObserverPattern.Generic.Observable;

public class ObserverClass implements Observer{
    
    Observable obs;
    
    public void update(){
        obs.getData();
        // Notify
    }

}
