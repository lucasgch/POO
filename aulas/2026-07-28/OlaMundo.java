import java.util.Scanner;

public class OlaMundo {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------- Sistema de cadastro de reservistas -------");

        System.out.print("Entre com seu nome: ");
        String name = sc.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe seu sexo(M/F): ");
        char sexo = Character.toLowerCase(sc.next().charAt(0));

        if ( sexo=='m' && idade<45 && idade>=18 ) {
            System.out.println(name+" precisa apresentar a carteira de reservista");
        } else {
            System.out.println(name+", não precisa apresentar a carteira de reservista");
        }

        System.out.println("-".repeat(50));

        sc.close();

    }

}
