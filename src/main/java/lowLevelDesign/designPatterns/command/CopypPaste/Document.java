package lowLevelDesign.designPatterns.command.CopypPaste;

public class Document {
    String copiedValue;
    String text;

    public Document(String text) {
        this.text = text;
    }

    void copyValue(int start, int end) {
        copiedValue = text.substring(start, end);
        System.out.println("Copies text : " + text.substring(start, end));
    }

    public void pasteValue() {
        System.out.println("Pasted last copied value " + this.copiedValue);
    }
}
