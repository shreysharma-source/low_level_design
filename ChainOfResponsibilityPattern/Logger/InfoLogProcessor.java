package LLD.ChainOfResponsibilityPattern.Logger;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor iNext){
        super(iNext);
    }

    public void log(int level, String text){
        if (level == LogProcessor.INFO){
            System.out.println("INFO " + text);
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
