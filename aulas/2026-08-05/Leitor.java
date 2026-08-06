import java.util.Scanner;

public class Leitor {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
        String linha = sc.nextLine();
        System.out.println("Saída: " + linha);
    }
    sc.close();    
    
    }
}
