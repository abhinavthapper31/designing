package lowLevelDesign.designPatterns.command.CopyPaste;

import java.util.Stack;

public class Invoker {

    Stack<Command> commandshistory;
    Command command;

    Invoker(Command command) {
        this.command = command;
        commandshistory = new Stack<>();
    }

    public void invoke() {
        command.execute();
        commandshistory.add(command);
    }

    public void undo() {
        Command lastCommand = commandshistory.pop();
        lastCommand.undo();
    }
}
