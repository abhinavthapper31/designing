package lowLevelDesign.designPatterns.strategyPattern;

public class App {

    // Strategy Pattern
    // Multiple ways of doing a thing at runtime
    //https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial#

    public static void main(String[] args) {
        Vehicle car = new Car(new DefaultDrivingStrategy());
        car.drive();


        HeavyDutyVehicle hdv = new HeavyDutyVehicle(new ExtremeDrivingStrategy());
        hdv.drive();
    }
}
