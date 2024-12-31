package LLD.Questions.Splitwise;

import java.util.ArrayList;

public class Group {
    String goupId;
    String groupName;

    ArrayList<User> members = new ArrayList<>();

    ArrayList<Expense> expenses = new ArrayList<>();

    ExpenseController expenseController;
}
