import ads.poo.entity.Aldeao;
import ads.poo.entity.Arqueiro;
import ads.poo.entity.Cavaleiro;
import ads.poo.entity.Personagem;

public class Main {

    static void main(String[] args) {

        Aldeao aldeao = new Aldeao();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        System.out.println(aldeao.mover());
        System.out.println(aldeao.atacar());

        System.out.println(arqueiro.mover());
        System.out.println(aldeao.atacar());

        System.out.println(cavaleiro.mover());
        System.out.println(cavaleiro.atacar());

    }
}
