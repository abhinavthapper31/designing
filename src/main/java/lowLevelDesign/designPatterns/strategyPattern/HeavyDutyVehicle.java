package lowLevelDesign.designPatterns.strategyPattern;

public class HeavyDutyVehicle extends Vehicle {
    public HeavyDutyVehicle(DrivingStrategy strategy) {
        super(strategy);
    }
}
