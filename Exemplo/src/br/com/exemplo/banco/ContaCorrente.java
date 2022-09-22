package br.com.exemplo.banco;

public class ContaCorrente extends Conta {
    
    private double limite;

    public ContaCorrente(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public ContaCorrente(double limite) {
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double consultarSaldoTotal(){
        return this.limite + getSaldo();
    }

}
