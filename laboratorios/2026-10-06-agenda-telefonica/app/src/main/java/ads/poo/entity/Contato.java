package ads.poo.entity;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dtNascimento) {
        this(nome, sobrenome);
        this.dataNascimento = dtNascimento;
    }

    public Contato(String nome, String sobrenome) {
        this(nome);
        this.sobrenome = sobrenome;
    }

    public Contato(String nome) {
        this.nome = nome;
        this.sobrenome = "";
        telefones = new HashMap<>();
        emails = new HashMap<>();
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
        if ( this.emails.containsKey(rotulo.toLowerCase()) ){
            return false;
        }
        Email novoEmail = new Email(rotulo, email);
        this.emails.put(rotulo.toLowerCase(), novoEmail);
        return true;
    }

    public boolean removeEmail(String rotulo) {
        if ( isNullOrEmpty(rotulo) ) {
            return false;
        }
        return this.emails.remove(rotulo.toLowerCase()) != null;
    }

    public boolean addTelefone(String rotulo, String numero) {
        if ( isNullOrEmpty(rotulo) || isNullOrEmpty(numero) ) {
            return false;
        }
        if ( this.telefones.containsKey(rotulo.toLowerCase()) ){
            return false;
        }
        Telefone novoTelefone = new Telefone(rotulo, numero);
        this.telefones.put(rotulo.toLowerCase(), novoTelefone);
        return true;
    }

    public boolean removeTelefone(String rotulo) {
        if ( isNullOrEmpty(rotulo) ) {
            return false;
        }
        return this.telefones.remove(rotulo.toLowerCase()) != null;
    }

    public boolean updateEmail(String rotulo, String valor){
        if (isNullOrEmpty(rotulo) || isNullOrEmpty(valor)) {
            return false;
        }
        Email existente = this.emails.get(rotulo.toLowerCase());
        if (existente != null) {
            return existente.setEmail(valor);
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String valor){
        if (isNullOrEmpty(rotulo) || isNullOrEmpty(valor)) {
            return false;
        }
        Telefone existente = this.telefones.get(rotulo.toLowerCase());
        if (existente != null) {
            existente.setNumero(valor);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(sobrenome, contato.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome); // <-- Usa exatamente os mesmos campos do equals!
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contato{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sobrenome='").append(sobrenome).append('\'');
        sb.append(", dataNascimento=").append(dataNascimento);
        sb.append(", telefones=").append(telefones);
        sb.append(", emails=").append(emails);
        sb.append('}');
        return sb.toString();
    }

}
