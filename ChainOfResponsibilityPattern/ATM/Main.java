package LLD.ChainOfResponsibilityPattern.ATM;

public class Main {
    public static void main(String[] args) {
        AtmHandler Atm = new R2000Handler(new R500Handler(null));

        Atm.handleRQ(5000);
        Atm.handleRQ(100);
        Atm.handleRQ(1000000);

    }
}
