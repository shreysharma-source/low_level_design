package LLD.ChainOfResponsibilityPattern.ATM;

public abstract class AtmHandler {
    
    AtmHandler nexAtmHandler;

    AtmHandler(AtmHandler iNext){
        this.nexAtmHandler = iNext;
    }
    
    public void handleRQ(int amount){
        if (nexAtmHandler != null){
            nexAtmHandler.handleRQ(amount);
        }
    };
}
