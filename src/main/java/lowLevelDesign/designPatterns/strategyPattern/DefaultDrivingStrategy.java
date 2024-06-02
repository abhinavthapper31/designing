package lowLevelDesign.designPatterns.strategyPattern;

public class DefaultDrivingStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("This is default driving strategy");
    }
}
