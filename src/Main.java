public class Main {
   public static void main(String[] args) {

       EditorHistory editor = new EditorHistory();

       editor.undo();
       System.out.println(editor.getCurrentState());
       editor.redo();
       System.out.println(editor.getCurrentState());

       editor.makeChange("Hello");
       editor.makeChange("Hello world");

       editor.undo();
       System.out.println(editor.getCurrentState());
       editor.undo();
       System.out.println(editor.getCurrentState());
       editor.redo();
       System.out.println(editor.getCurrentState());
   }
}