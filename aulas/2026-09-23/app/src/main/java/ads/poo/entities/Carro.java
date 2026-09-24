package ads.poo.entities;

public class Carro {

    private String marca;
    private Motor propulsor;

    public Carro(String m, Motor mo){
        this.marca = m;
        this.propulsor = mo;
    }

    public void acelerar(int valor){
        this.propulsor.acelerar(valor);
    }

    public void trocarMotor(Motor mo){
        this.propulsor = mo;
    }

}
