package ads.poo.entities;

import java.util.ArrayList;

public class Aviao {
    private int maxTripulantes;
    private int maxPassageiros;
    private double maxCombustivel;
    private boolean status;
    private Motor[] motores;
    
    public Aviao(int maxTripulantes, int maxPassageiros, double maxCombustivel, int numeroDeMotores) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.motores = new Motor[numeroDeMotores];
    }

    public int getMaxTripulantes() {
        return maxTripulantes;
    }

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public double getMaxCombustivel() {
        return maxCombustivel;
    }

    public boolean isStatus() {
        return status;
    }

    public Motor[] getMotores() {
        return motores;
    }

    public void setMaxTripulantes(int maxTripulantes) {
        this.maxTripulantes = maxTripulantes;
    }

    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    public void setMaxCombustivel(double maxCombustivel) {
        this.maxCombustivel = maxCombustivel;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMotores(int numeroDeMotores){
        
    }

    public void ligarMotor(int indexMotor){
        motores[indexMotor].ligarMotor(indexMotor);
    }

    public void desligarMotor(int indexMotor){
        motores[indexMotor].~desligarMotor(indexMotor);
    }

    
}
