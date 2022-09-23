package br.com.pratica3.folhapagamento;

public class FComissionado  extends Funcionario{
    private double percentual;
    private  double vendas;

    @Override
    public double calcularProventos() {
        double proventos = super.getSalario() + (this.vendas * this.percentual);
        return proventos;
        
    }
}
