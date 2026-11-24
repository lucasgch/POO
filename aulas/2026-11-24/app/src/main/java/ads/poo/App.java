package ads.poo;



public class App {

    static void main(String[] args) {

        System.out.println("ok");

        Biblioteca biblioteca = new Biblioteca();
        //Conta conta = new Conta(1, 1);
        //try {
        //    conta.saque(200);
        //} catch (SaldoInsuficienteException e){
        //    System.out.println("Erro " +e.getMessage());
        //}

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
