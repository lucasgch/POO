package ads.poo.entity;

public class Livro {

    private String isbn;
    private String title;
    private String author;
    private int releaseYear;

    public Livro(String isbn, String title, String author, int releaseYear){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    // Getter
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    // Setter

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return  "ISBN: " + isbn + " - " +
                "Título: " + title + " - " +
                "Autor: " + author + " - " +
                "Ano de publicação:" + releaseYear;
    }
}
