import java.util.Scanner;

public class Media{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        String name = sc.nextLine();

        System.out.println("Olá " + name);

        System.out.print("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = Math.round( ( nota1 + nota2 ) / 2.0 );
        
        System.out.println(String.format("A sua média é: %.2f", media));
        
        boolean aprovado = media>=6.0;
        System.out.print("Você foi");
        if (aprovado) {
            System.out.println(" aprovado!");
        } else {
            System.out.println(" reprovado!");
        }

        sc.close();        
    }
}