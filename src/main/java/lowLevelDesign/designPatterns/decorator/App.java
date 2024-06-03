package lowLevelDesign.designPatterns.decorator;

public class App {

    // inheritence can be used, but causes class explosion (New class for each topping)
    //https://refactoring.guru/design-patterns/decorator
    public static void main(String[] args) {

        Burger zinger = new ZingerBurger();

        System.out.println(zinger.getDescription() + " cost is " + zinger.getCost());

        // add cheese topping

        zinger = new ExtraCheeseBurger(zinger);

        System.out.println(zinger.getDescription() + " cost is " + zinger.getCost());


        zinger = new ExtraPattyBurger(zinger);
        System.out.println(zinger.getDescription() + " cost is " + zinger.getCost());


    }
}
