package LLD.ChainOfResponsibilityPattern.Logger;

public abstract class LogProcessor {

    public static int ERROR = 0;
    public static int INFO = 1;
    public static int DEBUG = 2;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor iNext){
        nextLogProcessor = iNext;
    }

    public void log(int level, String text){
        if (nextLogProcessor != null){
            nextLogProcessor.log(level, text);
        }
    }


    
}
