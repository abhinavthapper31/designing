package lowLevelDesign.designPatterns.command.AC;

import java.util.Stack;

public class Remote {
    Stack<Command> commandshistory;

    private Command command;

    Remote(Command command) {
        this.command = command;
        commandshistory = new Stack<>();

    }

    void pressButton() {
        command.execute();
        commandshistory.add(command);
    }
}
