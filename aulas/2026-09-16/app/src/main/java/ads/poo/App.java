package ads.poo;

import ads.poo.entity.Livro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private static Map<String, Livro> livros = new HashMap<>();

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Livro meuPrimeiroLivro = new Livro("978-8576573890", "Piquinique na estrada", "Arkádi Strugátski e Boris Strugátski", 2017);

        cadastrar(sc);
        cadastrar(sc);

        listarTodosIsbnTitulos();

        System.out.println("Consultando por ISBN");
        consultarPorISBN(sc);

        System.out.println("Consultando por Autor");
        consultarPorAutor(sc);

        System.out.println("Consultando por Ano de Publicação");
        consultarPorAnoPublicacao(sc);

        sc.close();
    }

    public static void cadastrar(Scanner sc){
        String isbn, title, author;
        int releaseYear;
        System.out.println("------ Método de cadastro de livros ------");

        boolean firstTry = true;
        do {
            if (!firstTry) {
                System.out.println("ISBN já cadastrado.");
            }
            System.out.print("Informe o ISBN: ");
            isbn = sc.nextLine();
            firstTry = false;
        } while (livros.containsKey(isbn));

        System.out.print("Informe o Título: ");
        title = sc.nextLine();
        System.out.print("Informe o Autor: ");
        author = sc.nextLine();
        System.out.print("Informe o Ano de lançamento: ");
        releaseYear = sc.nextInt();
        sc.nextLine();
        //Livro meuPrimeiroLivro = new Livro("978-8576573890", "Piquinique na estrada", "Arkádi Strugátski e Boris Strugátski", 2017);
        Livro meuPrimeiroLivro = new Livro(isbn, title, author, releaseYear);
        livros.put(isbn,meuPrimeiroLivro);
    }

    public static void listarTodosIsbnTitulos(){
        for (Livro livro: livros.values()){
            System.out.println(livro.getIsbn() + " - " + livro.getTitle());
        }
    }

    public static Livro consultarPorISBN(Scanner sc){
        System.out.print("Informe o ISBN para consultar: ");
        String isbn = sc.nextLine();

        if (livros.containsKey(isbn)){
            Livro livro = livros.get(isbn);
            System.out.println(livro);
            return livro;
        } else {
            System.out.println("ISBN "+ isbn + " não cadastrado!");
            return null;
        }
    }

    public static void consultarPorAutor(Scanner sc){
        System.out.print("Informe o autor para consultar: ");
        String autor = sc.nextLine();
        boolean hasAuthor = false;
        for (Livro livro: livros.values()){
            if (livro.getAuthor().equals(autor)){
                hasAuthor = true;
                System.out.println("ISBN: " + livro.getIsbn() +" - Título: " + livro.getTitle());
            }
            if (!hasAuthor){
                System.out.println("Autor " + autor+ " não cadastrado!");
            }
        }
    }

    public static void consultarPorAnoPublicacao(Scanner sc){
        System.out.print("Informe o ano para consultar: ");
        int releaseYear = sc.nextInt();

        boolean hasReleaseYear = false;
        for (Livro livro: livros.values()){
            if (livro.getReleaseYear()==releaseYear){
                hasReleaseYear = true;
                System.out.println("ISBN: " + livro.getIsbn() +" - Título: " + livro.getTitle());
            }
            if (!hasReleaseYear){
                System.out.println("Nenhum livro lançado no ano " + releaseYear);
            }
        }
    }

    public static void  atualizarLivro(Scanner sc) {
        System.out.print("Informe o ISBN do livro que deseja atualizar: ");
        String isbn = sc.nextLine();
        if (livros.containsKey(isbn)){
            Livro livro = livros.get(isbn);
            System.out.println(livro);
        }

    }

}
