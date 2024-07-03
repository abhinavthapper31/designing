package lowLevelDesign.designPatterns.nullObjectPattern;

public class App {

    /*
    *
    * Aim is to remove excessive object != null
    * if conditions
    *
    * USE A NULL OBJECT INSTEAD OF null.
    * DEFAULT behaviour or do nothing upon member access
    *
    * */
    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getVehicleByType("CAR") ;
        Vehicle bike = VehicleFactory.getVehicleByType("BIKE") ;

        System.out.println(car.getFuelCapacity());
        System.out.println(car.getSeatingCapacity());
        System.out.println(bike.getSeatingCapacity());
        System.out.println(bike.getSeatingCapacity());




    }
}
