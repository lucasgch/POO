package ads.poo.entity;

public class Pager extends Produto {
    String mensagem;

    public Pager(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, String mensagem) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.mensagem = mensagem;
    }

}
