package lowLevelDesign.splitwiseLLD.splits;

import lowLevelDesign.splitwiseLLD.models.Split;

import java.util.List;

public interface ExpenseSplit {
    public void validateSplitRequest(List<Split> splitList, double totalAmount);
}
