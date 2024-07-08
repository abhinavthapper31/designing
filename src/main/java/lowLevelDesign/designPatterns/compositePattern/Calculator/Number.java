package lowLevelDesign.designPatterns.compositePattern.Calculator;

public class Number implements Expression {

    private Integer value;

    Number(Integer number) {
        this.value = number;
    }

    @Override
    public int evaluate() {

        return this.value;
    }
}
