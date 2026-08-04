import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {

        double[][] notas = new double[3][3];

        Scanner sc = new Scanner(System.in);


        // Percorre a linha
        double mediaDaTurma = 0;
        for (int i = 0; i<notas.length; i++){
            for (int j = 0; j<notas.length; j++){
                if ( j<=1 ){
                    System.out.printf("Infome a Nota %d do Aluno %d: ", j, i+1);
                    notas[i][j]=sc.nextDouble();
                } else {
                    double media = Math.round(notas[i][0]+notas[i][1]/2.0);
                    notas[i][j]= media/2;
                    mediaDaTurma+=media;
                }
            }            
        }

        System.out.println("-".repeat(24));

        System.out.println(String.format("Nota 1   Nota 2    Media "));
        
        for (int i=0; i<=2; i++){
            for( int j=0; j<=2; j++){
                System.out.print(String.format(" %5.2f   ", notas[i][j]));
            }
            System.out.println();
        }

        System.out.println("-".repeat(24));
        mediaDaTurma=(mediaDaTurma-notas.length)/6;
        System.out.println("Média da turma: "+String.format("%.2f",mediaDaTurma));

    }    
    
}
