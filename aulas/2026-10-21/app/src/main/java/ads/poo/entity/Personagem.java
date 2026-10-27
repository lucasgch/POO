package ads.poo.entity;

public class Personagem {

    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(){}

    public Personagem(int vida, int a, double vel){
        this.vida = vida;
        this.ataque = a;
        this.velocidade = vel;
    }

    public String mover(){
        return "Personagem se moveu com velocidade: " +this.getVelocidade();
    }

    public String atacar(){
        return "Personagem acacou com força "+this.ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return  "vida: " + vida +
                ", ataque: " + ataque +
                ", velocidade: " + velocidade;
    }
}
