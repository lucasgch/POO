package ads.poo.entities;

public class Motor {
    private String tipo;
    private boolean ligado;

    public Motor(){
        this.ligado = false;
    }

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


    public void ligarMotor() {
        this.ligado = true;
    }

    public void desligarMotor() {
        this.ligado = false;
    }
}
