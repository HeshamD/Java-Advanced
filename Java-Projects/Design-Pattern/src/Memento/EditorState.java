package Memento;

//this class is responsible for storing Editor Content
// storing the undo features
//
public class EditorState {
    private final String content;
    private final String fontName;
    private final String fontSize;

    public EditorState(String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }
}
