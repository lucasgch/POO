package ads.poo;

public class App {

    public static void main(String[] args) {

        Horario[] casosDeTeste = new Horario[6];
        casosDeTeste[0] = new Horario(3,15,33);
        casosDeTeste[1] = new Horario(21,15,33);
        casosDeTeste[2] = new Horario(24,15,33);
        casosDeTeste[3] = new Horario(0,0,33);
        casosDeTeste[4] = new Horario(8,150,33);
        casosDeTeste[5] = new Horario(80,0,80);

        for (int i = 0; i < casosDeTeste.length; i++) {
            System.out.println("Caso de teste "+(i+1));
            System.out.println("Hora: "+casosDeTeste[i]);
            System.out.println("Hora por extenso: "+casosDeTeste[i].getHorarioPorExtenso());
        }

    }

}
