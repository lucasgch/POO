package ads.poo.entity;

public class Cavaleiro extends Personagem{

    public Cavaleiro() {
        super(50,3,2.0);
    }

    @Override
    public String mover() {
        return "Cavaleiro se moveu";
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacou";
    }
}
