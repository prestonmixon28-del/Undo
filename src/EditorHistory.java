public class EditorHistory {

    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    private String currentState = "";

    public void makeChange(String newState) {
        undoStack.push(currentState);
        currentState = newState;
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentState);
            currentState = undoStack.pop();
        }
    }

    public String getCurrentState() {
        return currentState;
    }
}
