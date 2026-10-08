package ads.poo.repository;

import ads.poo.entity.RotuloEmail;

import java.util.HashSet;
import java.util.Set;

public class RotuloEmailRepository {

    Set<RotuloEmail> rotulosDeEmail = new HashSet<>();

    public RotuloEmailRepository(Set<RotuloEmail> rotulosDeTelefone) {
        this.rotulosDeEmail = rotulosDeTelefone;
    }

    void addRotulo(RotuloEmail rotulo) {
        this.rotulosDeEmail.add(rotulo);
    }

}
