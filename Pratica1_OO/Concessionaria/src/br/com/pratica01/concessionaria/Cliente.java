package br.com.pratica01.concessionaria;

import java.util.Random;

public class Cliente {
    Random aleatorio = new Random();

    private String nome;
    private String cpf;
    private long numeroTelefone;
    private int anoNascimento;
    private String endereco;

    public Cliente(String nome, String cpf, long numeroTelefone, int anoNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
        this.anoNascimento = anoNascimento;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public long getNumeroTelefone() {
        return numeroTelefone;
    }
    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente [aleatorio=" + aleatorio + ", anoNascimento=" + anoNascimento + ", cpf=" + cpf + ", endereco="
                + endereco + ", nome=" + nome + ", numeroTelefone=" + numeroTelefone + "]";
    }


}
