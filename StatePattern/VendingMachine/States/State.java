package LLD.StatePattern.VendingMachine.States;

import java.util.ArrayList;

import LLD.StatePattern.VendingMachine.VendingMachine;

public interface State {
    //functions for all possible operations

    public void pressInsertCashButton(VendingMachine iVM) throws Exception;

    public void insertCash(VendingMachine iVM, Coin iCoin) throws Exception;

    public void selectItemButton(VendingMachine iVM) throws Exception;
    
    public void enterProductCode(VendingMachine iVM, int iCode) throws Exception;

    public ArrayList<Coin> cancelItem(VendingMachine iVM) throws Exception;

    public void getChange(VendingMachine iVM) throws Exception;

    public Item dispenseProduct(VendingMachine iVM, int iCode) throws Exception;

}
