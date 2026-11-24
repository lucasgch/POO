package ads.poo;

import java.util.Objects;

public class Livro {

    static int contadorDeId = 0;

    private int id;
    private String isbn;
    private String titulo;
    private String autor;

    public Livro(String isbn, String titulo, String autor) {
        this.id = contadorDeId+1;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return id == livro.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
