package lowLevelDesign.designPatterns.command.AC;

public interface Command {

    void execute();
    void undo(); // undo is reverse of execute always
}
