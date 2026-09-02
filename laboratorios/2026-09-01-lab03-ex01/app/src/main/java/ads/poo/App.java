package ads.poo;

public class App {

    public static void main(String[] args) {

        Ponto ponto1 = new Ponto(3.4,8.2);
        System.out.println("Ponto 1: "+ponto1);
        Ponto ponto2 = new Ponto(1.2,3.2);
        System.out.println("Ponto 2: "+ponto2);

        System.out.printf("Distância do ponto 1 ao ponto 2: %.2f%n",ponto1.distanciaEntreDoisPontos(ponto2));

        System.out.printf("Distância do ponto 2 ao ponto 1: %.2f%n",ponto2.distanciaEntreDoisPontos(ponto1));

        Ponto pontoZero = new Ponto(0,0);

        System.out.printf("Distância do ponto 1 ao ponto 0,0: %.2f%n",ponto1.distanciaEntreDoisPontos(pontoZero));

        System.out.printf("Distância do ponto 2 ao ponto 0,0: %.2f%n",ponto2.distanciaEntreDoisPontos(pontoZero));
    }

}
