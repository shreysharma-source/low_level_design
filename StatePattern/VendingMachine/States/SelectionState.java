package LLD.StatePattern.VendingMachine.States;

import java.util.ArrayList;

import LLD.StatePattern.VendingMachine.VendingMachine;

public class SelectionState implements State {

    public void pressInsertCashButton(VendingMachine iVM) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }

    public void insertCash(VendingMachine iVM, Coin iCoin) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }

    public void selectItemButton(VendingMachine iVM) throws Exception{
        return;
    }

    public void enterProductCode(VendingMachine iVM, int iCode) throws Exception{
        //choose item

        //calc change using coinlist

        //amount < cost -> refund full, otherwise return balance: call getChange, cancelItem
    }

    public ArrayList<Coin> cancelItem(VendingMachine iVM) throws Exception{
        //refund full amount
        return iVM.getCoinList();
    }

    public void getChange(VendingMachine iVM) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }

    public Item dispenseProduct(VendingMachine iVM, int iCode) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
    }
}
