package Streams;

public class Movie {
    private String title;
    private int likes;
    private Genre genre;
    public Movie(String title, int likes,Genre genre){
        this.likes = likes;
        this.title = title;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }
}
