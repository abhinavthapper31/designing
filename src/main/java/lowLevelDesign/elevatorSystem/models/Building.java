package lowLevelDesign.elevatorSystem.models;

import java.util.List;

public class Building {
    private Integer buildingId;
    private List<Floor> floors;

    Building(Integer buildingId, List<Floor> floors) {
        this.buildingId = buildingId;
        this.floors = floors;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}
