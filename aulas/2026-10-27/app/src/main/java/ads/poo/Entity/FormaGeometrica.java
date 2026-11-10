package ads.poo.Entity;

public abstract class FormaGeometrica {
    private String corDaLinha;
    private Coordenada coodenadaInicial;

    public FormaGeometrica(String corDaLinha, Coordenada coodenadaInicial) {
        this.corDaLinha = corDaLinha;
        this.coodenadaInicial = coodenadaInicial;
    }

    public String getCorDaLinha() {
        return corDaLinha;
    }

    public void setCorDaLinha(String corDaLinha) {
        this.corDaLinha = corDaLinha;
    }

    public Coordenada getCoodenadaInicial() {
        return coodenadaInicial;
    }

    public void setCoodenadaInicial(Coordenada coodenadaInicial) {
        this.coodenadaInicial = coodenadaInicial;
    }

    public abstract String desenhar();

    @Override
    public String toString() {
        return "FormaGeometrica: " +
                "CorDaLinha: " + corDaLinha + '\'' +
                ", CoodenadaInicial: " + coodenadaInicial;
    }
}
