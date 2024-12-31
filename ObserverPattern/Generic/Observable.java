package LLD.ObserverPattern.Generic;

import java.util.ArrayList;
import java.util.Collections;

public interface Observable {
    ArrayList<Observer> obsList;

    int data;

    public void add(Observer obs);

    public void remove(Observer obs);

    public void notify();

    public int getData();

    public void setData(int iData);

}
