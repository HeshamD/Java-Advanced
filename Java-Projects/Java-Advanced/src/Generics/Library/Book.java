package Generics.Library;

public class Book implements Library<Book>{
    private String bookName;
    private String chapers;

    public Book(String bookName, String chapers) {
        this.bookName = bookName;
        this.chapers = chapers;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getChapers() {
        return chapers;
    }

    public void setChapers(String chapers) {
        this.chapers = chapers;
    }

    @Override
    public String playAudio() {
        return "This book conatins " + chapers + " Chapters.";
    }

    @Override
    public String readScripts() {
        return "The book name is " + bookName;
    }
}
