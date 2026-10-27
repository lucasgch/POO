package ads.poo.Entity;

public class Linha extends FormaGeometrica {

    private Coordenada coordenadaFinal;

    public Linha(String corDaLinha, Coordenada coodenadaInicial, Coordenada coordenadaFinal) {
        super(corDaLinha, coodenadaInicial);
        this.coordenadaFinal = coordenadaFinal;
    }

    public Coordenada getCoordenadaFinal() {
        return coordenadaFinal;
    }

    public void setCoordenadaFinal(Coordenada coordenadaFinal) {
        this.coordenadaFinal = coordenadaFinal;
    }

    @Override
    public String toString() {
        return "Tipo da forma: Linha. " +
                "Coordenada Inicial: " + this.getCoodenadaInicial() +
                ". Coordenada Final: " + this.getCoordenadaFinal() +".";
    }

}
