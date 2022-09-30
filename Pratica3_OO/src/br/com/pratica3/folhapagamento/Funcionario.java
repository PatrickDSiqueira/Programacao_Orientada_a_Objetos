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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
