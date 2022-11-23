import Memento.Editor;
import Memento.History;
import State.Canvas;
import State.SelectionTool;

public class Main {
    public static void main(String[] args) {
//        var editor = new Editor();
//        editor.setContent("a");
//        editor.setContent("b");
//        editor.setContent("c");
//        System.out.println(editor.undo());
//        System.out.println(editor.undo());
//        System.out.println(editor.undo());
//        System.out.println(editor.undo());
//
//        // Using the memento pattern
//        History history = new History();
//        editor.setContent("a");
//        history.push(editor.createState());
//        editor.setContent("b");
//        history.push(editor.createState());
//        editor.setContent("c");
//        editor.restore(history.pop());

        var canvas = new Canvas();
        canvas.setCurrentTole(new SelectionTool());
        canvas.setCurrentTole(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}