package lowLevelDesign.designPatterns.strategyPattern;

public class ExtremeDrivingStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("This is extreme driving strategy");
    }
}
