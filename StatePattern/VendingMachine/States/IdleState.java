package LLD.StatePattern.VendingMachine.States;

import java.util.ArrayList;

import LLD.StatePattern.VendingMachine.VendingMachine;

public class IdleState implements State{

    public void pressInsertCashButton(VendingMachine iVM) throws Exception{
        iVM.setState(new GetMoneyState());
    }

    public void insertCash(VendingMachine iVM, Coin iCoin) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }

    public void selectItemButton(VendingMachine iVM) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }

    public void enterProductCode(VendingMachine iVM, int iCode) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }

    public ArrayList<Coin> cancelItem(VendingMachine iVM) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }

    public void getChange(VendingMachine iVM) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }

    public Item dispenseProduct(VendingMachine iVM, int iCode) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }
}
