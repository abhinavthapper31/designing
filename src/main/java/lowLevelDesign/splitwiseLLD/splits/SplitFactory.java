package lowLevelDesign.splitwiseLLD.splits;

import lowLevelDesign.splitwiseLLD.enums.SplitType;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(SplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }

}
