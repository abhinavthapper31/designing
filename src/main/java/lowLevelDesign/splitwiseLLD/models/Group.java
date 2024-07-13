package lowLevelDesign.splitwiseLLD.models;

import lowLevelDesign.splitwiseLLD.enums.SplitType;
import lowLevelDesign.splitwiseLLD.managers.ExpenseManager;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Integer groupId;
    private String groupName;
    private List<User> members;
    private List<Expense> expenseList;
    ExpenseManager expenseManager;


    public Group() {

    }

    public Group(Integer groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.members = new ArrayList<>();
        expenseList = new ArrayList<>();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    // an expense is created on group
    Expense createExpense(Integer expenseId, Integer description, int amount, User paidBy, SplitType splitType, List<Split> splitDetails) {
        Expense expense = expenseManager.createExpense(expenseId, description, amount, splitDetails, splitType, paidBy);
        expenseList.add(expense);
        return expense;

    }
}
