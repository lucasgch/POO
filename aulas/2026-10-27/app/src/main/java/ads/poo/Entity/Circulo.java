package ads.poo.Entity;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(String corDaLinha, Coordenada coodenadaInicial, double raio) {
        super(corDaLinha, coodenadaInicial);
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(this.raio,2);
    }

    public double calcularPerimetro(){
        return Math.PI * 2 * this.raio;
    }

    @Override
    public String toString() {
        return "Tipo da forma: Circulo. " +
                "Ponto Central: " + this.getCoodenadaInicial() +
                ". Raio: " + this.raio +".";
    }
}
