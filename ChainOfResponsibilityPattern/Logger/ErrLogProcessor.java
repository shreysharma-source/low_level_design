package LLD.ChainOfResponsibilityPattern.Logger;

public class ErrLogProcessor extends LogProcessor{

    ErrLogProcessor(LogProcessor iNext){
        super(iNext);
    }

    public void log(int level, String text){
        if (level == LogProcessor.ERROR){
            System.out.println("ERROR " + text);
        }
        else{
            if(nextLogProcessor != null){
                nextLogProcessor.log(level, text);
            }
            else{
                System.out.println("Unable to log");
            }
        }
    }
    
}
