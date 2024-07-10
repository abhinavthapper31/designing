package lowLevelDesign.designPatterns.compositePattern.Calculator;

public class App {

    /*
     * COMPOSITE DESGIN PATTERN
     * Object within an object or when a hierarchy (or tree) is created.
     *
     * */
    public static void main(String[] args) {

        Number num1 = new Number(5);
        Number num2 = new Number(5);
        Number num3 = new Number(10);
        Number num4 = new Number(10);

        Expression exp1 = new ArithmeticExpression(num1, Operation.ADD, num2);

        Expression exp2 = new ArithmeticExpression(num3, Operation.SUBTRACT, num4);

        Expression finalExp = new ArithmeticExpression(exp1, Operation.MULTIPLY, exp2);

        System.out.println(finalExp.evaluate());


    }
}
