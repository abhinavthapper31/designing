package lowLevelDesign.designPatterns.nullObjectPattern;

public class Bike implements Vehicle {

    // constructors

    @Override
    public int getSeatingCapacity() {
        return 50;
    }

    @Override
    public int getFuelCapacity() {
        return 49;
    }
}
