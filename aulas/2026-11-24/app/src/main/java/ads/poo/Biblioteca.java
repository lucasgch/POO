package ads.poo;


import java.util.HashMap;


public class Biblioteca {

    private int id;
    private String nome;

    HashMap<Livro, Integer> listaDeLivros = new HashMap<>();

    public Biblioteca(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }



}
