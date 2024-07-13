package lowLevelDesign.splitwiseLLD.models;

import lowLevelDesign.splitwiseLLD.enums.SplitType;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    Integer expenseId;
    String description;
    double expenseAmount;
    User paidByUser;
    SplitType splitType;
    List<Split> splitDetails = new ArrayList<>();

    public Expense(Integer expenseId, double expenseAmount, String description,
                   User paidByUser, SplitType splitType, List<Split> splitDetails) {

        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.description = description;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails.addAll(splitDetails);

    }
}
