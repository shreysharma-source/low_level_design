package LLD.Questions.Splitwise;

import java.util.ArrayList;

public class ExpenseController {
    public Expense createExpense(String iExpenseId, String iExpenseDesc, User iPaidByUser, 
                                    ArrayList<Split> iShareList, ExpenseSplitType iSplitType, double iAmount){
        
        ExpenseSplitType expenseSplit = SplitFactory.getSplitObject(iSplitType);
        // validate split maybe

        Expense expense = new Expense(iExpenseId, iExpenseDesc, iPaidByUser, iShareList, iAmount, iSplitType);
        
        //balance sheet update to be added

        return expense;
    
    }
}
