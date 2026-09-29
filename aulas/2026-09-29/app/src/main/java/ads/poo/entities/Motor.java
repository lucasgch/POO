package ads.poo.entities;

public class Motor {
    String tipo;
    boolean ligado;

    public Motor(String tipo){
        this.tipo = tipo;
        this.ligado = false;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    
}
