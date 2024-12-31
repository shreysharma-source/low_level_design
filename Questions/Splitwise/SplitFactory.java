package LLD.Questions.Splitwise;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(ExpenseSplitType iSplitType){
        switch(iSplitType){
            case EQUAL: return new EqualExpenseSplit();
            case UNEQUAL: return new UnequalExpenseSplit();
            case PERCENTAGE: return new PercentageExpenseSplit();
            default: return null;
        }
    }
}
