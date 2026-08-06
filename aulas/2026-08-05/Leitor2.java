import java.util.Scanner;

public class Leitor2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nlinha = 0;
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            nlinha++;
            String[] linhas = linha.split(",");
            String nome = linhas[0];
            double nota1;
            double nota2;    
            try{
                nota1 = Double.parseDouble(linhas[1]);
                nota2 = Double.parseDouble(linhas[2]);    
            } catch (NumberFormatException e) {
                System.out.println("Erro na linha " + nlinha + ": As notas devem ser números válidos.");
                continue; // Pula para a próxima iteração do loop
            }            
            double media = Math.round( (nota1 + nota2) / 2.0 );

            String resultado = media >= 6.0 ? "Aprovado" : "Reprovado";
            System.out.println("Aluno: "+ nome + "- Media: " + media + " - " + resultado);
        }
        sc.close();

    }
}
