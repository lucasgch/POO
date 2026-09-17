package ads.poo;

import ads.poo.entity.Livro;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class App {

    private static Map<String, Livro> livros = new HashMap<>();

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            imprimirMenu();
            loop = leExecutaMenu(sc);
        }

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

    public static Optional<Livro> consultarPorISBN(Scanner sc){

        System.out.print("Informe o ISBN para consultar: ");
        String isbn = sc.nextLine();

        if (livros.containsKey(isbn)){
            Livro livro = livros.get(isbn);
            System.out.println(livro);
            return Optional.ofNullable(livro);
        } else {
            System.out.println("ISBN "+ isbn + " não cadastrado!");
            return Optional.empty();
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
        }
        if (!hasAuthor){
            System.out.println("Autor " + autor+ " não cadastrado!");
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
        }
        if (!hasReleaseYear){
            System.out.println("Nenhum livro lançado no ano " + releaseYear);
        }
    }

    public static void  atualizarLivro(Scanner sc) {
        System.out.print("Informe o ISBN do livro que deseja atualizar: ");
        String isbn = sc.nextLine();
        if (livros.containsKey(isbn)){
            Livro livro = livros.get(isbn);
            System.out.println("Livro encontrado: " + livro);
            System.out.print("Informe o novo título (ou pressione Enter para manter o atual): ");
            String novoTitulo = sc.nextLine();
            if (!novoTitulo.isEmpty()) {
                livro.setTitle(novoTitulo);
            }
            System.out.print("Informe o novo autor (ou pressione Enter para manter o atual): ");
            String novoAutor = sc.nextLine();
            if (!novoAutor.isEmpty()) {
                livro.setAuthor(novoAutor);
            }
            System.out.print("Informe o novo ano de lançamento (ou pressione Enter para manter o atual): ");
            String novoAnoStr = sc.nextLine();
            if (!novoAnoStr.isEmpty()) {
                int novoAno = Integer.parseInt(novoAnoStr);
                livro.setReleaseYear(novoAno);
            }
            System.out.println("Livro atualizado: " + livro);
            livros.put(isbn, livro);
        } else {
            System.out.println("ISBN "+ isbn + " não cadastrado!");
        }
    }

    public static void removerLivro(Scanner sc) {
        System.out.print("Informe o ISBN do livro que deseja remover: ");
        String isbn = sc.nextLine();
        if (livros.containsKey(isbn)) {
            livros.remove(isbn);
            System.out.println("Livro com ISBN " + isbn + " removido com sucesso.");
        } else {
            System.out.println("ISBN " + isbn + " não cadastrado!");
        }
    }

    public static void imprimirMenu(){
        int largura = 50;
        String texto = "Sistema de gerenciamento de livros!";
        imprimirDiv(largura);
        System.out.printf("%" + ((largura - texto.length()) / 2 + texto.length()) + "s%n", texto);
        imprimirDiv(largura);
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Listar todos os livros (ISBN e Título)");
        System.out.println("3. Consultar livro por ISBN");
        System.out.println("4. Consultar livro por autor");
        System.out.println("5. Consultar livro por ano de publicação");
        System.out.println("6. Atualizar livro");
        System.out.println("7. Remover livro");
        System.out.println("8. Popular base de dados com livros de exemplo");
        System.out.println("9. Sair");
        imprimirDiv(largura);
    }

    public static void popularBaseDeDados() {
        Livro livro1 = new Livro("978-8576573890", "Piquinique na estrada", "Arkádi Strugátski e Boris Strugátski", 2017);
        Livro livro2 = new Livro("978-8535902778", "1984", "George Orwell", 2009);
        Livro livro3 = new Livro("978-8535914849", "Admirável Mundo Novo", "Aldous Huxley", 2014);
        Livro livro4 = new Livro("978-8525044884", "Fahrenheit 451", "Ray Bradbury", 2012);
        Livro livro5 = new Livro("978-8576572350", "Fundação", "Isaac Asimov", 2015);

        livros.put(livro1.getIsbn(), livro1);
        livros.put(livro2.getIsbn(), livro2);
        livros.put(livro3.getIsbn(), livro3);
        livros.put(livro4.getIsbn(), livro4);
        livros.put(livro5.getIsbn(), livro5);

        System.out.println("Base de dados populada com 5 livros de exemplo.");
    }

    public static boolean leExecutaMenu(Scanner sc){
        String opcao = sc.nextLine();
        switch (opcao) {
            case "1":
                cadastrar(sc);
                break;
            case "2":
                listarTodosIsbnTitulos();
                break;
            case "3":
                consultarPorISBN(sc);
                break;
            case "4":
                consultarPorAutor(sc);
                break;
            case "5":
                consultarPorAnoPublicacao(sc);
                break;
            case "6":
                atualizarLivro(sc);
                break;
            case "7":
                removerLivro(sc);
                break;
            case "8":
                popularBaseDeDados();
                break;
            case "9":
                System.out.println("Saindo do sistema...");
                return false;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
        return true;
    }
    static void imprimirDiv(int largura){
        System.out.println("-".repeat(largura));
    }
}
