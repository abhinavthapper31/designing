package lowLevelDesign.designPatterns.compositePattern.Calculator;

public class ArithmeticExpression implements Expression {
    Expression leftExpression;
    Operation operation;
    Expression rightExpression;

    public ArithmeticExpression(Expression leftExpression, Operation operation, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.operation = operation;
        this.rightExpression = rightExpression;
    }

    @Override
    public int evaluate() {
        int result = 0;

        switch (this.operation) {
            case ADD:
                result = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                result = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                result = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                result = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }
        return result;
    }
}
