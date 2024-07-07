package lowLevelDesign.elevatorSystem.models;

import lowLevelDesign.elevatorSystem.enums.ElevatorDirection;
import lowLevelDesign.elevatorSystem.enums.ElevatorState;

public class Elevator {
    private Integer elevatorId;
    private Display display;
    private ElevatorState state;
    private ElevatorDirection elevatorDirection;
    private InternalButton internalButton;

}

