package LLD.ObserverPattern.Generic;

public class ObservableClass implements Observable{
    public void add(Observer obs){
        obsList.add(obs);
    }

    public void remove(Observer obs){
        obsList.remove(obs);
    }

    public void notify(){
        for (Observer obs: obsList){
            obs.update();
        }
    }

    public int getData(){
        return data;
    }

    public void setData(int iData){
        data = iData;
    }
}
