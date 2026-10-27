package ads.poo.entity;

public class Aldeao extends Personagem {

    public Aldeao() {
        super(25,1,0.8);
    }

    @Override
    public String mover() {
        return "Aldeão se movu com velocidade: "+this.getVelocidade();
    }

    @Override
    public String atacar() {
        return "Aldeão acacou com força "+this.getAtaque();
    }
}
