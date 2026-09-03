package ads.poo;

import java.util.Arrays;

public class Robo {

    static int contadorNumeroSerie;

    private String nome;
    private String tipo;
    private double nivelBateria;
    double[] posicao = new double[2];
    int numeroSerie;

    public Robo(){
        nivelBateria = 0;
        this.numeroSerie = ++contadorNumeroSerie;
    }

    public Robo(String nome) {
        this.nome = nome;
        nivelBateria = 0;
        this.numeroSerie = ++contadorNumeroSerie;
    }

    public Robo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        nivelBateria = 0;
        this.numeroSerie = ++contadorNumeroSerie;
    }

    public Robo(String nome, String tipo, double nivelBateria) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivelBateria = nivelBateria;
        this.numeroSerie = ++contadorNumeroSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        if (nivelBateria >= 0){
            this.nivelBateria = nivelBateria;
        }
    }

    public double[] getPosicao() {
        return posicao;
    }

    public boolean setPosicao(double[] posicao) {
        if (posicao != null &&  posicao.length == 2){
            this.posicao = posicao;
            return true;
        }
        return false;
    }

    public boolean andar(String direcao, double distancia){
        if (distancia <= 0 || nivelBateria <= 0){
            return false;
        }

        double percorrido = Math.min(calculaDistanciaMaximaNaBateria(),distancia);
        double consumo = calculaConsumoTotalDeBateria(percorrido);

        nivelBateria-=consumo;
        switch (direcao.toLowerCase()){
            case "up","cima","subir", "para cima" -> posicao[1] += percorrido;
            case  "down", "baixo", "descer", "para baixo" -> posicao[1] -= percorrido;
            case "left", "esquerda", "para a esquerda", "para esquerda" -> posicao[0] -= percorrido;
            case "right", "direita", "para a direita", "para direita" -> posicao[0] += percorrido;
            default -> {
                return false;
            }
        }
        return true;
    }

    public double calculaConsumoTotalDeBateria(double distancia){
        return distancia/2;
    }

    public double calculaDistanciaMaximaNaBateria(){
        return nivelBateria*2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumeroSerie: ").append(numeroSerie).append("%n");
        sb.append("Nome: ");
                if (nome!=null){
                    sb.append(nome).append("%n");
                } else {
                    sb.append("Sem nome definido").append("%n");
                }
                sb.append("Tipo: ");
                if (tipo!=null){
                    sb.append(tipo).append("%n");
                } else {
                    sb.append("Sem tipo definido").append("%n");
                }
                sb.append(String.format("Posicao: ( %.2f , %.2f )",getPosicao()[0],getPosicao()[1])).append("%n");
                sb.append("Nivel de Bateria: ").append(nivelBateria).append("%n");
                return String.format(sb.toString());
    }
}
