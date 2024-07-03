package lowLevelDesign.designPatterns.nullObjectPattern;

public class VehicleFactory {

    static Vehicle getVehicleByType(String vehicleType) {

        if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return new NullVehicle();
    }

}
