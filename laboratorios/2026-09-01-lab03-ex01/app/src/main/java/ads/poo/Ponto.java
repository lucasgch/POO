package ads.poo;

public class Ponto{
    // Propriedades
    private double x;
    private double y;

    // Construtor
    public Ponto(double x,double y){
        this.x=x;
        this.y=y;
    }

    // Getters
    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }


    // Recebe como parâmetro um objeto da classe Ponto e retorne a distância entre 2 pontos.
    public double distanciaEntreDoisPontos(Ponto ponto){

        double x1 = this.getX();
        double x2 = ponto.getX();
        double y1 = this.getY();
        double y2 = ponto.getY();

        double inicio = Math.pow((x2 - x1),2);
        double fim = Math.pow((y2 - y1),2);

        return Math.sqrt(inicio + fim);
    }

    // ToString
    public String toString(){
        return String.format("(%.2f, %.2f)%n",this.x,this.y);
    }
}