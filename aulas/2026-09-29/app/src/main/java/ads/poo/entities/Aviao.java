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
        this.status = false;

        // Valida se a quantidade de motores é válida
        if (numeroDeMotores < 0 || numeroDeMotores > 8) {
            throw new IllegalArgumentException("A quantidade de motores deve ser entre 0 e 8.");
        }

        this.motores = new Motor[numeroDeMotores];
        for (int i = 0; i < numeroDeMotores; i++) {
            this.motores[i] = new Motor(); // Ajuste o construtor do Motor se necessário
        }
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

    public void setMotores(int numeroDeMotores) {
        if (numeroDeMotores < 0 || numeroDeMotores > 8) {
            throw new IllegalArgumentException("A quantidade de motores deve ser entre 0 e 8.");
        }

        this.motores = new Motor[numeroDeMotores];
        for (int i = 0; i < numeroDeMotores; i++) {
            this.motores[i] = new Motor();
        }
    }

    public void ligarMotor(int indexMotor) {
        if (indexMotor >= 0 && indexMotor < motores.length) {
            motores[indexMotor].ligarMotor();
        } else {
            throw new IndexOutOfBoundsException("Índice de motor inválido: " + indexMotor);
        }
    }

    public void desligarMotor(int indexMotor) {
        if (indexMotor >= 0 && indexMotor < motores.length) {
            motores[indexMotor].desligarMotor();
        } else {
            throw new IndexOutOfBoundsException("Índice de motor inválido: " + indexMotor);
        }
    }
    
}
