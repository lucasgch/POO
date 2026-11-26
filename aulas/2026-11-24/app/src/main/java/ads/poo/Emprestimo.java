package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Emprestimo {

    private int id;
    private User usuario;
    private ArrayList<Livro> livrosEmprestados;
    private int quantidadeEmprestada;
    private final int MAX_POR_USUARIO = 3;

    public Emprestimo(User usuario, ArrayList<Livro> livrosEmprestados) {
        this.usuario = usuario;
        this.livrosEmprestados = livrosEmprestados;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }

    public void setQuantidadeEmprestada(int quantidadeEmprestada) {
        this.quantidadeEmprestada = quantidadeEmprestada;
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
