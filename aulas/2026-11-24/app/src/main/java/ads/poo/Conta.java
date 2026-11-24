package ads.poo;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }
}
