package ads.poo.entity;

public class Aldeao extends Personagem implements Coletor {

    public Aldeao() {
        super(25,1,0.8);
    }

    @Override
    public String mover() {
        return "Aldeão se moveu com velocidade: "+this.getVelocidade();
    }

    @Override
    public String atacar() {
        return "Aldeão acacou com força "+this.getAtaque();
    }

    @Override
    public String coletarMadeira() {
        return "Aldeao coletando Madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeao Coletando Ouro";
    }
}
