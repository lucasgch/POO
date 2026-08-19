package ads.poo;

public class Carro {

    // Atributos
    private String equipe;
    private final double velocidadeMaxima = 100;
    private double velocidadeAtual;
    private double capacidadeCombustivel;

    // Métodos
    public void acelerar(double incremento){

        if (velocidadeAtual+incremento<velocidadeMaxima){
            this.velocidadeAtual+=incremento;
        } else {
            velocidadeAtual=100;
        }

    }

    public void freiar(double decremento){
        if ( velocidadeAtual - decremento >=0 ){
            velocidadeAtual-=decremento;
        } else {
            velocidadeAtual=0;
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

}
