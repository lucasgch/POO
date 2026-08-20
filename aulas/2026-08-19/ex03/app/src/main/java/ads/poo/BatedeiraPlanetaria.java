package ads.poo;

public class BatedeiraPlanetaria {

    private String marca;
    private int voltagem;
    private final double capacidadeMaxima = 300.00;
    private double cargaAtual;
    private int velocidade;
    private boolean power;

    public void setCargaAtual(double carga){
        cargaAtual=carga;
    }
    public void setPower(boolean power) {
        this.power=power;
    }

    public boolean getPower(){
        return power;
    }

    public void incrementarVelocidade(){
        if(velocidade<3){
            velocidade++;
        }
    }

    public void inserirCarga(double carga){
        if (cargaAtual+carga<=capacidadeMaxima){
            cargaAtual+=carga;
        }
    }

    public void removerCarga(double cargaARemover){
        if ( cargaAtual-cargaARemover >=0 ){
            cargaAtual = cargaAtual - cargaARemover;
        } else {
            cargaAtual=0;
        }
    }

    public void decrementarVelocidade(){
        if(velocidade>0){
            velocidade--;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
