import java.util.Scanner;

public class OlaMundo {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------- Sistema de cadastro de reservistas -------");

        System.out.print("Entre com seu nome: ");
        String name = sc.nextLine();

        // TODO: Faça um programa para ler a idade e o sexo de uma pessoa
        // Informe se precisa apresentar atestado de reservista

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe seu sexo(M/F): ");
        char sexo = Character.toLowerCase(sc.next().charAt(0));

        if ( sexo=='m' && idade<45 ) {
            System.out.println("Precisa apresentar a carteira de reservista");
        } else {
            System.out.println("Não precisa apresentar a carteira de reservista");
        }

        System.out.println("-".repeat(50));

    }

}
