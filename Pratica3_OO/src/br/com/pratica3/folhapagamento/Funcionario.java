package br.com.pratica3.folhapagamento;

public abstract class Funcionario {

    @Override
    public String toString() {
        return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
    }

    private int matricula;
    private String nome;
    private Double salario;

    public double calcularProventos() {
        return this.salario;
    }
}
