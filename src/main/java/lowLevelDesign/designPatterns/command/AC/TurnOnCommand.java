package lowLevelDesign.designPatterns.command.AC;

public class TurnOnCommand implements Command {

    private AirConditioner ac;

    TurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
        System.out.println("turn on Command executed");
    }

    @Override
    public void undo() {
        ac.turnOff();
        System.out.print("Undid turn on");
    }
}
