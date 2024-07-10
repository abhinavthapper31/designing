package lowLevelDesign.designPatterns.command.CopyPaste;

public class App {

    public static void main(String[] args) {

        Document doc = new Document("abcsjincsdc");

        Command copyCommand = new CopyCommand(doc, 0, 7);
        Invoker invoker = new Invoker(copyCommand);
        invoker.invoke();

        Command pasteCommand = new PasteCommand(doc);

        invoker = new Invoker(pasteCommand);
        invoker.invoke();
        invoker.invoke();
        invoker.invoke();
        invoker.invoke();

        invoker.undo();
        invoker.undo();     invoker.undo();


    }
}
