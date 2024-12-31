package LLD.ChainOfResponsibilityPattern.Logger;

public class DebugLogProcessor extends LogProcessor {

    DebugLogProcessor(LogProcessor iNext){
        super(iNext);
    }

    public void log(int level, String text){
        if (level == LogProcessor.DEBUG){
            System.out.println("DEBUG " + text);
        }
        else{
            if (nextLogProcessor != null){
                nextLogProcessor.log(level, text);
            }
            else{
                System.out.println("Unable to print");
            }
        }
    }
}
