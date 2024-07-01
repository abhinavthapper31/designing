package lowLevelDesign.parkingLot.models;

import lowLevelDesign.parkingLot.VehicleType;

public class Vehicle {
    private int vehicleNo;
    private VehicleType vehicleType;

    Vehicle(int vehicleNo, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

}
