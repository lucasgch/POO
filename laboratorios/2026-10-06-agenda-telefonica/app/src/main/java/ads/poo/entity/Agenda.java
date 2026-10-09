package ads.poo.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<>();

    public boolean addContato(Contato contato){
        if (contato == null){
            return false;
        }
        return this.contatos.add(contato);
    }

    public boolean removeContato(Contato contato){
        if (contato == null){
            return false;
        }
        return this.contatos.remove(contato);
    }

    public boolean removeContato(int indiceContato){
        if (indiceContato >= 0 && indiceContato < this.contatos.size()) {
            this.contatos.remove(indiceContato);
            return true;
        }
        return false;
    }

    public boolean removeContato(String nome, String sobrenome) {
        if (nome == null || sobrenome == null) {
            return false;
        }
        return this.contatos.removeIf(c ->
                c.getNome().equalsIgnoreCase(nome) &&
                        c.getSobrenome().equalsIgnoreCase(sobrenome)
        );
    }

    // Atualiza informando o contato que desejamos atualizar
    public boolean updateContato(Contato contato) {
        if (contato == null) {
            return false;
        }

        int indice = this.contatos.indexOf(contato);
        if (indice == -1) {
            return false; // Não encontrado na agenda
        }

        this.contatos.set(indice, contato);
        return true;
    }

    // Atualiza por índice informando o contato a alterar
    public boolean updateContato(int indice, Contato novoContato) {
        if (novoContato == null || indice < 0 || indice >= this.contatos.size()) {
            return false;
        }

        this.contatos.set(indice, novoContato);
        return true;
    }

    // Atualiza por índice informando dados a alterar: nome sobrenome data nascimento
    public boolean updateContato(int indice, String novoNome, String novoSobrenome, LocalDate novaData) {
        if (indice < 0 || indice >= this.contatos.size()) {
            return false;
        }

        Contato c = this.contatos.get(indice);
        c.setNome(novoNome);
        c.setSobrenome(novoSobrenome);
        c.setDataNascimento(novaData);
        return true;
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
        ArrayList<Contato> contatosEncontrados = new ArrayList<>();
        for (Contato contato: contatos){
            if (contato.getNome().equalsIgnoreCase(nome) && contato.getSobrenome().equalsIgnoreCase(sobrenome)){
                contatosEncontrados.add(contato);
            }
        }

        if (contatosEncontrados.isEmpty()){
            return null;
        }

        return contatosEncontrados;
    }

    // Método auxiliar que busca e retorna um contato pelo índice
    private Contato getContatoPorIndice(int indice) {
        if (indice >= 0 && indice < this.contatos.size()) {
            return this.contatos.get(indice);
        }
        return null;
    }

    public boolean addTelefone(String rotulo, String numero, int indice){
        Contato c = getContatoPorIndice(indice);
        return c != null && c.addTelefone(rotulo, numero);
    }

    public boolean removeTelefone(String rotulo, String numero, int indice){
        Contato c = getContatoPorIndice(indice);
        return c != null && c.removeTelefone(rotulo);
    }

    public boolean updateTelefone(String rotulo, String numero, int indice){
        Contato c = getContatoPorIndice(indice);
        return c != null && c.updateTelefone(rotulo, numero);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agenda{");
        sb.append("contatos=").append(contatos);
        sb.append('}');
        return sb.toString();
    }
}
