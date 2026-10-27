package ads.poo.Entity;

public class Retangulo extends Forma2D {

    private Coordenada coordenadaFinal;

    public Retangulo(String corDaLinha, Coordenada coodenadaInicial, Coordenada coordenadaFinal) {
        super(corDaLinha, coodenadaInicial);
        this.coordenadaFinal = coordenadaFinal;
    }

    public Coordenada getCoordenadaFinal() {
        return coordenadaFinal;
    }

    public void setCoordenadaFinal(Coordenada coordenadaFinal) {
        this.coordenadaFinal = coordenadaFinal;
    }

    public double calcularLargura(){
        return this.getCoordenadaFinal().getX() - this.getCoodenadaInicial().getX();
    }

    public double calcularAltura(){
        return this.getCoordenadaFinal().getY() - this.getCoodenadaInicial().getY();
    }

    public double calcularArea(){
        return calcularAltura() * calcularLargura();
    }

    public double calcularPerimetro(){
        return 2*calcularLargura() + 2*calcularLargura();
    }




    @Override
    public String toString() {
        return "Tipo da forma: Retangulo. " +
                "Coordenada Inicial: " + this.getCoodenadaInicial() +
                ". Coordenada Final: " + this.getCoordenadaFinal() +".";
    }
}
