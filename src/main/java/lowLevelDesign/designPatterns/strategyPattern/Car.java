package lowLevelDesign.designPatterns.strategyPattern;

public class Car extends Vehicle {
    public Car(DrivingStrategy strategy) {
        super(strategy);
    }
}
