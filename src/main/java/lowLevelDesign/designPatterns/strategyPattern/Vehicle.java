package lowLevelDesign.designPatterns.strategyPattern;

public class Vehicle {

    private DrivingStrategy strategy;

    // Vehicle creation requires strategy of that vehicle
    // Constructor injection
    public Vehicle(DrivingStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive() {
        System.out.println("Calling drive method of the set field");
        strategy.drive();
    }

}