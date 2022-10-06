package br.com.pratica03.folhadepagamento;

public class FProdutividade extends Funcionario {
    private double valor;
    private int producao;
    

    
    public FProdutividade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }



    @Override
    public double calcularProventos() {
        return super.calcularProventos() + (this.valor * this.producao);
    }
    
}
