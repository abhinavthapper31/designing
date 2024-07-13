package lowLevelDesign.splitwiseLLD.managers;

import lowLevelDesign.splitwiseLLD.enums.SplitType;
import lowLevelDesign.splitwiseLLD.models.Expense;
import lowLevelDesign.splitwiseLLD.models.Split;
import lowLevelDesign.splitwiseLLD.models.User;
import lowLevelDesign.splitwiseLLD.splits.ExpenseSplit;
import lowLevelDesign.splitwiseLLD.splits.SplitFactory;

import java.util.List;

public class ExpenseManager {

    // responsible for validation of incoming expense.





    public Expense createExpense(Integer expenseId, String description, int amount, List<Split> splitDetails, SplitType splitType, User paidBy) {

        // get the type of split
        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);

        ;// validate type of split
        expenseSplit.validateSplitRequest(splitDetails, amount);

        Expense expense = new Expense(expenseId, amount, description, paidBy, splitType, splitDetails);

        // use balance sheet controller to updated expenses

        return expense;



    }
}
