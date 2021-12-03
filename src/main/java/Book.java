import java.util.ArrayList;

public class Book {

    public static ArrayList<Book> books = new ArrayList<>();

    public String title, author, genre, released, comments;
    public boolean isNotBorrowed;
    public int id, score;

    public Book(String title, String author, String genre, String released, String comments, int score, boolean isNotBorrowed, int id) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.released = released;
        this.comments = comments;
        this.isNotBorrowed = isNotBorrowed;
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return  "\n" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Genre: " + genre + "\n" + "Released: " + released + "\n" + "Customer comments: " + comments + "\n" + "Borrowed? " + isNotBorrowed + "\n" + "Customers ID: " + id + "\n" + "Customer Score: " + score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isNotBorrowed() {
        return isNotBorrowed;
    }

    public void setIsNotBorrowed(boolean isNotBorrowed) {
        this.isNotBorrowed = isNotBorrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
