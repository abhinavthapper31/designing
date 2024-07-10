package lowLevelDesign.designPatterns.command.CopyPaste;

public class Document {
    String lastCopiedValue;
    String text;

    public Document(String text) {
        this.text = text;
    }

    void copyValue(int start, int end) {
        lastCopiedValue = text.substring(start, end);
        System.out.println("Copies text : " + text.substring(start, end));
    }

    public void pasteValue() {
        System.out.println("Pasted last copied value " + this.lastCopiedValue);
    }
}
