package Memento;

import java.util.Stack;

public class Editor {
    private String content;
    private String fontName;
    private String fontSize;

    public EditorState createState(){
        return new EditorState(content,fontName,fontSize);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String undo(){
        if (restore.isEmpty()) return "Nothing to undo";
        return this.restore.pop();
    }
    private Stack<String> restore = new Stack<>();

}
