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
        System.out.print("Em quantas disciplinas você quer se cadastrar? (Máximo 5): ");
        int nDisciplinas = sc.nextInt();
        sc.nextLine();
        int diasTotais = 0;

        String[][] matricula = new String[nDisciplinas][5];

        for (int i=0; i<nDisciplinas; i++){

            System.out.print("Informe a sigla da disciplina: ");
            matricula[i][0] = sc.nextLine();

            do{
                System.out.print("Informe o dia da semana que tem aula ou insira não para sair: ");

                String entrada = sc.nextLine().toLowerCase();

                if ( entrada.equals("nao") || entrada.equals("não") ){
                    break;
                }
                if ( entrada.equals("seg") || entrada.equals("segunda") || entrada.equals("segunda-feira")){
                    matricula[i][1]="- Seg";
                    diasTotais++;
                } else if ( entrada.equals("ter") || entrada.equals("terca") || entrada.equals("terça") || entrada.equals("terca-feira") || entrada.equals("terça-feira")){
                    matricula[i][2]="- Ter";
                    diasTotais++;
                } else if ( entrada.equals("qua") || entrada.equals("quarta") || entrada.equals("quarta-feira")){
                    matricula[i][3]="- Qua";
                    diasTotais++;
                } else if ( entrada.equals("qui") || entrada.equals("quinta") || entrada.equals("quinta-feira")) {
                    matricula[i][4]="- Qui";
                    diasTotais++;
                } else if ( entrada.equals("sex") || entrada.equals("sexta") || entrada.equals("sexta-feira")) {
                    matricula[i][5]="- Sex";
                    diasTotais++;
                }
            } while (diasTotais<5);

        }

        for (int i=0; i<nDisciplinas; i++){
            System.out.printf("Na disciplina %s você tem aula nos seguintes dias:%n",matricula[i][0]);
            for (int j=0; j<5; j++) {
                if (matricula[i][j] != null) {
                    System.out.println(matricula[i][j]);
                }
            }
        }

    }

}