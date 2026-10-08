package ads.poo.repository;

import ads.poo.entity.Telefone;

import java.util.HashMap;

public class TelefoneRepository {

    private HashMap<String, Telefone> telefones;

    public TelefoneRepository() {
        this.telefones = new HashMap<>();
    }

    public HashMap<String, Telefone> getTelefones() {
        return telefones;
    }

}
