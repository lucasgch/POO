package ads.poo;

public class Caneta {
    private String cor;
    private double nivelTinta; // 0 a 100%
    private final double CONSUMO = 0.01;

    public Caneta(String cor){
        this.cor = cor;
    }

    public Caneta(String cor, double nivelTinta){
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public String getCor(){
        return this.cor;
    }

    public void setNivelTinta(double quantidadeDeTinta){
        this.nivelTinta = nivelTinta;
    }

    public double getNivelTinta(){
        return nivelTinta;
    }

    // método desenhar que recebe as coordenadas inicial e final
    // se houver tinta suficiente, debite o consumo e retorne qual foi o consumo
    // se não houver tinta suficiente, retorne -1

    // Cada unidade consome 0,01% de tinta

    public double desenhar(double[] coordenadaInicial, double[] coordenadaFinal){
        double consumo = 0;
        double inicio = Math.pow(coordenadaFinal[0]-coordenadaInicial[0],2);
        double fim = Math.pow(coordenadaFinal[1]-coordenadaInicial[1],2);
        double distanciaPercorrida = Math.sqrt( inicio+fim );
        if (distanciaPercorrida>1) {
            consumo = distanciaPercorrida * (CONSUMO / 100);
        }
        if (nivelTinta >consumo){
            this.nivelTinta -=consumo;
            return nivelTinta;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Cor: " + cor + '\n' + "Tinta: " + nivelTinta+"%";
    }
}
