// Faça um programa que o usuário deve informar:
// - Sigla da disciplina
// - Todos os dias da semana que tem aula dessa disciplina
//
// Imprima:
// Na disciplina **** Você tem aula nos seguintes dias:
// - seg
// - qua
// - sex
// minimo - 1 dia por semana
// maximo - 5 dias por semana
import java.util.Scanner;

public class Data{

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String siglaDisciplina;
        System.out.print("Informe a sigla da disciplina: ");
        siglaDisciplina = sc.nextLine();

        System.out.print("Informe os dias da semana que tem aula: ");
        String[] dias = sc.nextLine().toLowerCase().split(" ");

        System.out.printf("Na disciplina %s você tem aulas nos seguintes dias:%n",siglaDisciplina);

        for (int i=0; i<dias.length; i++){
            if ( dias[i].equals("seg") || dias[i].equals("segunda") || dias[i].equals("segunda-feira")){
                System.out.println("- Seg");
            } else if ( dias[i].equals("ter") || dias[i].equals("terca") || dias[i].equals("terça") || dias[i].equals("terca-feira") || dias[i].equals("terça-feira")){
                System.out.println("- Ter");
            } else if ( dias[i].equals("qua") || dias[i].equals("quarta") || dias[i].equals("quarta-feira")){
                System.out.println("- Qua");
            } else if ( dias[i].equals("qui") || dias[i].equals("quinta") || dias[i].equals("quinta-feira")) {
                System.out.println("- Qui");
            } else if ( dias[i].equals("sex") || dias[i].equals("sexta") || dias[i].equals("sexta-feira")) {
                System.out.println("- Sex");
            }
        }

    }

}