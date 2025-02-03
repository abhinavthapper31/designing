package lowLevelDesign.textEditor;

import java.util.*;

// Memento Pattern for storing snapshots
class Memento {
    List<String> state; //  is just list of prior line texts
    int cursor; // points to a valid line in the content list

    Memento(List<String> state, int cursor) {
        this.state = new ArrayList<>(state);
        this.cursor = cursor;
    }

    List<String> getState() {
        return state;
    }

    int getCursor() {
        return cursor;
    }
}

class TextEditor {
    private List<String> content = new ArrayList<>();
    private List<String> clipboard = new ArrayList<>();
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();
    private int cursor = 0;

    // Display methods
    public void display() {
        for (int i = 0; i < content.size(); i++)
            System.out.println(i + ": " + content.get(i) + (i == cursor ? " <- Cursor" : ""));
    }

    public void display(int n, int m) {
        for (int i = n; i <= m && i < content.size(); i++)
            System.out.println(i + ": " + content.get(i) + (i == cursor ? " <- Cursor" : ""));
    }

    // Move cursor to line n
    public void moveCursor(int n) {
        if (n >= 0 && n < content.size()) {
            cursor = n;
        }
    }

    // Insert line of text
    public void insert(String text) {
        saveState();
        content.add(cursor, text);
    }

    // Delete line at cursor position
    public void delete() {
        saveState();
        if (cursor < content.size())
            content.remove(cursor);
    }

    public void delete(int n, int m) {
        saveState();
        for (int i = n; i <= m && n < content.size(); i++)
            content.remove(n);
    }

    // Copy content from a specific part of one line to another
    public void copyPart(int startLine, int startPos, int endLine, int endPos) {
        clipboard.clear();

        // Handle out of bounds
        if (startLine < 0 || startLine >= content.size() || endLine < 0 || endLine >= content.size()) {
            System.out.println("Invalid line numbers.");
            return;
        }

        // Start copying from the start line and position
        StringBuilder copiedText = new StringBuilder();

        // Copy the content from the start line
        String startLineText = content.get(startLine);
        if (startPos >= 0 && startPos < startLineText.length()) {
            copiedText.append(startLineText.substring(startPos)); // Append from startPos till end of line
        } else {
            System.out.println("Invalid start position.");
            return;
        }

        // If the start line is not the same as the end line, copy content from intermediary lines
        if (startLine != endLine) {
            // Copy entire lines in between (if applicable)
            for (int i = startLine + 1; i < endLine; i++) {
                copiedText.append(content.get(i));
            }

            // Copy part of the last line (endLine) till the endPos
            String endLineText = content.get(endLine);
            if (endPos >= 0 && endPos <= endLineText.length()) {
                copiedText.append(endLineText.substring(0, endPos)); // Append up to endPos
            } else {
                System.out.println("Invalid end position.");
                return;
            }
        } else {
            // If the start line and end line are the same, just copy part of the line
            String endLineText = content.get(endLine);
            if (endPos >= 0 && endPos <= endLineText.length()) {
                copiedText.append(endLineText.substring(startPos, endPos)); // Copy part of the same line
            } else {
                System.out.println("Invalid end position.");
                return;
            }
        }

        // Add the copied text to clipboard
        clipboard.add(copiedText.toString());
    }

    // Paste clipboard content at cursor position
    public void paste() {
        saveState();
        content.addAll(cursor, clipboard);
    }

    // Save state for undo
    private void saveState() {
        undoStack.push(new Memento(new ArrayList<>(content), cursor));
        redoStack.clear(); // Clear redo stack when new changes are made
    }

    // Undo the last command
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(new Memento(new ArrayList<>(content), cursor));
            Memento memento = undoStack.pop();
            content = memento.getState();
            cursor = memento.getCursor();
        }
    }

    // Redo the last undone command
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(new Memento(new ArrayList<>(content), cursor));
            Memento memento = redoStack.pop();
            content = memento.getState();
            cursor = memento.getCursor();
        }
    }

    // For testing purposes
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.insert("Hello World, this is a paragraph. line 1");
        editor.insert("This is the second line.");
        editor.insert("We are now in the third line.");
        editor.insert("The fourth line is here.");
        editor.insert("End of the paragraph.");
        editor.display();

        // Copy part from the 2nd line (position 10) to 4th line (position 5)
        editor.copyPart(1, 10, 3, 5);
        System.out.println("Clipboard content:");
        editor.clipboard.forEach(System.out::println);

        editor.moveCursor(3);
        editor.paste();
        editor.display();

        editor.undo();
        editor.display();
    }
}
