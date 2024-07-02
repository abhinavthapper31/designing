package lowLevelDesign.carRentalSystem;

import lowLevelDesign.carRentalSystem.models.Product.Bike;
import lowLevelDesign.carRentalSystem.models.Product.Car;
import lowLevelDesign.carRentalSystem.models.Product.Vehicle;

import java.util.List;

public class VehicleInventory {
    List<Vehicle> carList;

    VehicleInventory(List<Vehicle> carList) {
        this.carList = carList;
    }


    public List<Vehicle> getCarList() {
        return carList;
    }

    public void setCarList(List<Vehicle> carList) {
        this.carList = carList;
    }
}
