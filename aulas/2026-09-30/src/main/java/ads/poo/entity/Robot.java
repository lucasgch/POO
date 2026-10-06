package ads.poo.entity;

public class Robot {

    private String name;
    private Battery battery;
    private Position position;
    private double weight;
    private double speed;
    private boolean status;

    // Construtor principal
    public Robot(String name, double weight, Position position) {
        this.name = name;
        this.weight = weight;
        this.speed = 0.0;
        this.position = position;
        this.status = false;
    }

    // Construtor alternativo (começa na origem 0,0)
    public Robot(String name, double weight) {
        this(name, weight, new Position(0,0));
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

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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