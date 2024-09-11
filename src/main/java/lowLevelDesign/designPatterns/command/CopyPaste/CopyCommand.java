package lowLevelDesign.designPatterns.command.CopyPaste;

public class CopyCommand implements Command {
    Document doc;
    int start;
    int end;

    CopyCommand(Document doc, int start, int end) {
        this.doc = doc;
        this.start = start;
        this.end = end;
    }


    @Override
    public void execute() {
        this.doc.copyValue(start, end);
    }

    @Override
    public void undo() {
        return;
    }
}
