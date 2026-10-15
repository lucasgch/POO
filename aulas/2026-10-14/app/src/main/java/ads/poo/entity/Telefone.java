package ads.poo.entity;

public class Telefone extends Produto{
    private String tipo;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, String tipo) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  super.getModelo() +
                ", tipo: " + tipo;
    }
}
