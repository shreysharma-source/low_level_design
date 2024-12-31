package LLD.ChainOfResponsibilityPattern.ATM;

public class R2000Handler extends AtmHandler{

    int notes = 100;

    R2000Handler(AtmHandler iNext){
        super(iNext);
    }

    public void handleRQ(int amount){
        if (notes >= amount/2000){
            notes -= amount/2000;
            System.out.println("Dispensing " + amount/2000 +" 2000 notes");
            if (nexAtmHandler != null)
                nexAtmHandler.handleRQ(amount % 2000);
        }
        else{
            if (nexAtmHandler != null)
                nexAtmHandler.handleRQ(amount);
        }
    }

    
}
