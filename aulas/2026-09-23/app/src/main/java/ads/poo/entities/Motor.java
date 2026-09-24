package ads.poo.entities;

public class Motor {

    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(){}

    public Motor(int hp, int cilindros){
        this.hp = hp;
        this.cilindros = cilindros;
        this.giroAtual = 0;
    }

    public void acelerar(int v){
        this.giroAtual+=v;
    }

}
