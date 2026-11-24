package ads.poo;

import java.util.ArrayList;

public class Emprestimo {

    private int id;
    private User usuario;
    private ArrayList<Livro> livrosEmprestados;

    public Emprestimo(User usuario, ArrayList<Livro> livrosEmprestados) {
        this.usuario = usuario;
        this.livrosEmprestados = livrosEmprestados;
    }

    public ArrayList<Livro> getLivrosEmprestados(){
        return this.livrosEmprestados;
    }

    public boolean adicionaLivro(Livro livro){
        livrosEmprestados.add(livro);
        return true;
    }

    public boolean removeLivro(Livro livro){
        try{
            livrosEmprestados.remove(livro);
        } catch (LivroNaoConstaNoEmprestimo e){

        }
        return true;
    }
}
