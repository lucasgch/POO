package ads.poo.entity;

public class Celular extends SemFio {
    private String modeloCelular;

    public Celular(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, String tipo, double frequencia, int canais, double distanciaOperacao, String modeloCelular) {
        super(codigo, numSerie, modelo, peso, dimensao, tipo, frequencia, canais, distanciaOperacao);
        this.modeloCelular = modeloCelular;
    }
}
