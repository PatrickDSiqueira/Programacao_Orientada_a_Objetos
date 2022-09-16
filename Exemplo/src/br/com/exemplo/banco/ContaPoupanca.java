package br.com.exemplo.banco;

public class ContaPoupanca extends Conta {
    
    private double rendimento;
    
    public ContaPoupanca(String numero, double saldo2, double rendimento) {
        super(numero, saldo2);
        this.rendimento = rendimento;
    }

    public Double getRendimento() {
        return rendimento;
    }
    
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void CalcularRendimento(){
        setSaldo(getSaldo() + getSaldo() * (rendimento/100));
    }
}
