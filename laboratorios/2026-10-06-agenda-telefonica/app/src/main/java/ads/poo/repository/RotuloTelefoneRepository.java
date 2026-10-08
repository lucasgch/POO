package ads.poo.repository;

import ads.poo.entity.RotuloTelefone;

import java.util.HashSet;
import java.util.Set;

public class RotuloTelefoneRepository {

    Set<RotuloTelefone> rotulosDeTelefone = new HashSet<>();

    public RotuloTelefoneRepository(Set<RotuloTelefone> rotulosDeTelefone) {
        this.rotulosDeTelefone = rotulosDeTelefone;
    }

    void addRotulo(RotuloTelefone rotulo) {
        this.rotulosDeTelefone.add(rotulo);
    }
}
