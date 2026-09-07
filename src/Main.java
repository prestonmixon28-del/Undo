public class Main {
   public static void main(String[] args) {

       EditorHistory editor = new EditorHistory();

       editor.makeChange("hello");
       editor.makeChange("hello world");

       System.out.println(editor.getCurrentState());
       editor.undo();
       System.out.println(editor.getCurrentState());
   }
}