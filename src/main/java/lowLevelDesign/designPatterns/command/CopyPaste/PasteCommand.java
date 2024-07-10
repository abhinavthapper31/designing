package lowLevelDesign.designPatterns.command.CopyPaste;


public class PasteCommand implements Command {

    Document doc;

    PasteCommand(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.pasteValue();
    }

    @Override
    public void undo() {
        System.out.println("undo");
    }
}
