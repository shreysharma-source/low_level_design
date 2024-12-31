package LLD.ChainOfResponsibilityPattern.Logger;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new ErrLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));

        logger.log(1, "Hello");
        logger.log(2, "Hello" );
        logger.log(5, "STFU");
    }
}
