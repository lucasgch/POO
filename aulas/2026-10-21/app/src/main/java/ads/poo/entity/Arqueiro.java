package ads.poo.entity;

public class Arqueiro extends Personagem{

    public Arqueiro() {
        super(35, 2, 1.0);
    }

    @Override
    public String mover() {
        return "Arqueiro se moveu";
    }

    @Override
    public String atacar() {
        return "Arqueiro atacou";
    }
}
