package LLD.Questions.Splitwise;

import java.util.ArrayList;

public class Expense {
    String expenseId;
    String expenseDesc;
    User paidByUser;
    ArrayList<Split> shareList = new ArrayList<>();
    double amount;
    ExpenseSplitType splitType;
    
    public Expense(String iExpenseId, String iExpenseDesc, User iPaidByUser, 
                    ArrayList<Split> iShareList, double iAmount, ExpenseSplitType iSplitType){
        this.expenseId = iExpenseId;
        this.expenseDesc = iExpenseDesc;
        this.paidByUser = iPaidByUser;
        this.shareList = iShareList;
        this.amount = iAmount;
        this.splitType = iSplitType;
    }
}
