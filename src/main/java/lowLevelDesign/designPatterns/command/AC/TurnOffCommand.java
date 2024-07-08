package lowLevelDesign.designPatterns.command.AC;

public class TurnOffCommand implements Command {


    private AirConditioner ac;

    TurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
        System.out.println("turn off command excecuted");

    }

    @Override
    public void undo() {
        ac.turnOn();
        System.out.print("Undid turn off");
    }
}
