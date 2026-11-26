package ads.poo;


import java.util.ArrayList;
import java.util.HashMap;


public class Biblioteca {

    static int contadorDeId = 0;
    static int contadorDeLivros = 0;

    private int id;
    private String nome;

    private HashMap<User, Integer> listaDeUsuarios = new HashMap<User, Integer>();;
    private HashMap<Livro, Integer> listaDeLivros = new HashMap<Livro, Integer>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca(String nome) {
        this.id = contadorDeId+1;
        this.nome = nome;
    }

    public boolean cadastrarLivro(Livro livro){
        cadastrarLivro(livro, 0);
        return true;
    };

    public boolean cadastrarLivro(Livro livro, int quantidadeEmEstoque){
        if (quantidadeEmEstoque>=0){
            listaDeLivros.put(livro, quantidadeEmEstoque);
            return true;
        } else {
            System.out.println("Exceção personalizada: Quantidade de estoque inválida!");
            return false;
        }
    };


    public boolean retirarLivro(Livro livro){
        retirarLivro(livro, 1);
        return true;
    }

    public boolean retirarLivro(Livro livro, int quantidadeARemover){
        Integer quantidadeEmEstoque = listaDeLivros.get(livro);
        if ( livro == null || quantidadeARemover == 0 || quantidadeEmEstoque == 0) {
            return false;
        }
        int novaQuantidade = quantidadeEmEstoque - quantidadeARemover;
        listaDeLivros.put(livro, novaQuantidade);
        return true;
    }

    public boolean removerLivro(Livro livro){
        if (!listaDeLivros.containsKey(livro)){
            // Livro não cadastrado
            return false;
        }
        if (isEmprestado(livro)){
            // Livro possui empréstimo
            return false;
        }
        else {
            listaDeLivros.remove(livro);
        }
        return true;
    };

    public boolean cadastrarUsuario(User usuario){
        listaDeUsuarios.put(usuario, usuario.getId());
        return true;
    }

    public boolean removerUsuario(User usuario){
        listaDeUsuarios.remove(usuario);
        return true;
    }

    public boolean isEmprestado(Livro livro){
        for (Emprestimo e: emprestimos){
            for (Livro l: e.getLivrosEmprestados()){
                if (l.equals(livro)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean emprestarLivro(Livro livro, User usuario){
        // #TODO
        return true;
    }

    public boolean devolverLivro(Livro livro, User usuario){
        // #TODO
        return true;
    }

}
