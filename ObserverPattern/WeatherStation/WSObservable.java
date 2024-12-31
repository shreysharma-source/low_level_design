package LLD.ObserverPattern.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WSObservable implements Observable {
    int currTemp;

    List<Observer> obsList;

    WSObservable(){
        obsList = new ArrayList<>();
    }


    public void add(Observer obs){
        obsList.add(obs);
    }

    public void remove(Observer obs){
        obsList.remove(obs);
    }

    public void notify(int temp){
        System.out.println("Notifying all observers");
        for (Observer obs: obsList){
            obs.update(temp);
        }
    }

    public void setCurrTemp(int temp){
        currTemp = temp;
        notify(temp);
    }

    public int getTemp(){
        return currTemp;
    }
}
