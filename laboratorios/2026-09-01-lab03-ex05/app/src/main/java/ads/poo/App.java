package ads.poo;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {

        Robo robo01 = new Robo();
        Robo robo02 = new Robo("Andy");
        Robo robo03 = new Robo("Cleaner","AspiradorDePó");
        Robo robo04 = new Robo("Jett","Brinquedo", 100);

        double[] posicao1 = {0.1, 0.3};

        robo04.setPosicao(posicao1);

        System.out.println(robo04);

        System.out.printf("Consegue andar: %b%n%n",robo04.andar("Para cima", 1.1));

        System.out.println("Definindo o nível de bateria em 100");
        robo04.setNivelBateria(100);
        System.out.println(robo04);

        System.out.printf("Consegue andar: %b%n%n",robo04.andar("Para cima", 1.1));

        System.out.println(robo04);

        System.out.printf("Consegue andar: %b%n%n",robo04.andar("Para cima", -10.1));

        System.out.println(robo04);

    }

}
