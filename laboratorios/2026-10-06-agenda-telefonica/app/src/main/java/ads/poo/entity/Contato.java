package ads.poo.entity;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.HashMap;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public boolean addEmail(String rotulo, String email){
        if ( isNullOrEmpty(rotulo) || isNullOrEmpty(email) ) {
            return false;
        }
        RotuloEmail novoRotulo = new RotuloEmail(rotulo);
        Email novoEmail = new Email(rotulo, email);
        return true;
    }

    public boolean addTelefone(String rotulo, String numero) throws ParseException {
        if ( isNullOrEmpty(rotulo) || isNullOrEmpty(numero) ) {
            return false;
        }
        RotuloTelefone novoRotulo = new RotuloTelefone(rotulo);
        Telefone novoTelefone = new Telefone(novoRotulo, numero);
        return true;
    }
}
