package ads.poo.entity;

public class Robot {

    private String name;
    private double weight;
    private double x;
    private double y;
    private double speed;
    private boolean status;

    // Construtor principal
    public Robot(String name, double weight, double x, double y) {
        this.name = name;
        this.weight = weight;
        this.x = x;
        this.y = y;
        this.status = false;
    }

    // Construtor alternativo (começa na origem 0,0)
    public Robot(String name, double weight) {
        this(name, weight, 0.0, 0.0);
    }

    // Calcula o consumo com o deslocamento e velocidade informada
    public double calculateConsumption(double displacement, double speed) {
        double rate = 0;

        if ( speed == 0 && !status ) {
            return 0;
        }

        // 1. Define a taxa base pelo peso
        if (this.weight < 25) {
            rate = 1.0;
        } else if (this.weight < 50) {
            rate = 2.0;
        } else {
            rate = 3.0;
        }

        // 2. Ajusta a taxa com base na velocidade
        if (speed > 0.0) {
            if (speed < 25) {
                rate *= 1.0; // Velocidade baixa: mantém a taxa base
            } else if (speed < 50) {
                rate *= 1.5; // Velocidade média: aumenta o consumo em 50%
            } else {
                rate *= 2.0; // Velocidade alta: dobra o consumo
            }
        }

        // O consumo final é a taxa ajustada multiplicada pelo deslocamento
        return rate * displacement;
    }

    // Calcula o consumo com a velocidade atual do robô
    public double calculateConsumption(double displacement) {
        return calculateConsumption(displacement, this.speed);
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    // Se o peso mudar, atualizamos o consumo por unidade para manter a consistência
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // TODO: Método caminhar
}