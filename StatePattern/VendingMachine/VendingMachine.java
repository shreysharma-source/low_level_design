package LLD.StatePattern.VendingMachine;

import java.util.ArrayList;

import LLD.StatePattern.VendingMachine.States.IdleState;
import LLD.StatePattern.VendingMachine.States.State;

// import LLD.StatePattern.VendingMachine.*;

public class VendingMachine {
    State currState = new IdleState();
    ArrayList<Coin> coinList = new ArrayList<>();

    public void setState(State iState){
        currState = iState;
    }

    public ArrayList<Coin> getCoinList(){
        return coinList;
    }

}
