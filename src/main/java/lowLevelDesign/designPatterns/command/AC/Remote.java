package lowLevelDesign.designPatterns.command.AC;

public class Remote {

    private Command command;

    Remote(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }


}
