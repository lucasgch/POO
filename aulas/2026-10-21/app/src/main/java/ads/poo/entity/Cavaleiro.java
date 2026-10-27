package ads.poo.entity;

public class Cavaleiro extends Personagem{

    public Cavaleiro() {
        super(50,3,2.0);
    }

    @Override
    public String mover() {
        return "Cavaleiro se moveu com velocidade: " +this.getVelocidade();
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacou com força: "+this.getAtaque();
    }
}
