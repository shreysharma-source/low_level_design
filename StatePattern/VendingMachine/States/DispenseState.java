package LLD.StatePattern.VendingMachine.States;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import LLD.StatePattern.VendingMachine.VendingMachine;

public class DispenseState implements State{
    DispenseState(){
        System.out.println("Dispensing product");
        dispenseProduct();
    }

    public void pressInsertCashButton(VendingMachine iVM) throws Exception{
        throw new Exception("Operation can't be performed in the current state");
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
        Item item = iVM.getInventory().getItem(iCode);
        // update inventory and sold out status
        return item;
    }
    
}
