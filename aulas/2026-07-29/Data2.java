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

public class Data2 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String siglaDisciplina;
        System.out.print("Informe a sigla da disciplina: ");
        siglaDisciplina = sc.nextLine();


        String[] dias = new String[5];
        int diasTotais = 0;
        do{
            System.out.print("Informe o dia da semana que tem aula ou insira não para sair: ");
            String entrada = sc.nextLine().toLowerCase();
            if ( entrada.equals("nao") || entrada.equals("não") ){
                break;
            }

            if ( entrada.equals("seg") || entrada.equals("segunda") || entrada.equals("segunda-feira")){
                dias[0]="- Seg";
                diasTotais++;
            } else if ( entrada.equals("ter") || entrada.equals("terca") || entrada.equals("terça") || entrada.equals("terca-feira") || entrada.equals("terça-feira")){
                dias[1]="- Ter";
                diasTotais++;
            } else if ( entrada.equals("qua") || entrada.equals("quarta") || entrada.equals("quarta-feira")){
                dias[2]="- Qua";
                diasTotais++;
            } else if ( entrada.equals("qui") || entrada.equals("quinta") || entrada.equals("quinta-feira")) {
                dias[3]="- Qui";
                diasTotais++;
            } else if ( entrada.equals("sex") || entrada.equals("sexta") || entrada.equals("sexta-feira")) {
                dias[4]="- Sex";
                diasTotais++;
            }
        } while (diasTotais<5);

        System.out.printf("Na disciplina %s você tem aulas nos seguintes dias:%n",siglaDisciplina);

        for (int i=0; i<dias.length; i++){
            if (dias[i]!=null){
                System.out.println(dias[i]);
            }
        }

    }

}