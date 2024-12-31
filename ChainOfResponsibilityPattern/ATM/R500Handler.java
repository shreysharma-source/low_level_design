package LLD.ChainOfResponsibilityPattern.ATM;

public class R500Handler extends AtmHandler{

    int notes = 100;

    R500Handler(AtmHandler iNext){
        super(iNext);
    }

    public void handleRQ(int amount){
        if (notes >= amount/500){
            notes -= amount/500;
            System.out.println("Dispensing " + amount/500 +" 500 notes");
            if (nexAtmHandler!= null)
                nexAtmHandler.handleRQ(amount % 500);
        }
        else{
            if (nexAtmHandler != null){
                nexAtmHandler.handleRQ(amount);
            }
            else{
                System.out.println("Unable to dispense amount");
            }
        }
    }
    
}
