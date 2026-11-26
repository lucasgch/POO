package ads.poo;



public class App {

    static void main(String[] args) {

        System.out.println("ok");

        Biblioteca biblioteca = new Biblioteca("Biblioteca do IFSC");
        Livro livro01 = new Livro("978-65-89999-01-3", "Livro titulo", "Joao autor");
        Livro livro02 = new Livro("978-65-89999-01-4", "Livro titulo 2", "Joao autor 02");
        User usuario01 = new User("Joao");
        biblioteca.cadastrarUsuario(usuario01);
        biblioteca.cadastrarLivro(livro01);
        System.out.println(biblioteca.removerLivro(livro02));
        System.out.println(livro01.getId());
        System.out.println(livro02.getId());

    }

    public void firstMain(){
        int a, b;

        try {

            a = Integer.parseInt(IO.readln("Entre com um número: "));
            b = Integer.parseInt(IO.readln("Entre com um número: "));

            int res = a / b;

            System.out.println(String.format("%d / %d = %d", a, b, res));

        } catch(NumberFormatException e){

            System.out.println("Só é permitido números inteiros");

        } catch(ArithmeticException e){

            System.out.println("Não foi possivel dividir");

        } catch(Exception e){

            System.out.println("Erro inesperado!");

        }

        finally {

            System.out.println("Fim do programa");

        }
    }

}
