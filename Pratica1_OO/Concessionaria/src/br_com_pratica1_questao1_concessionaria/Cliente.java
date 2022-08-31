package br_com_pratica1_questao1_concessionaria;

import java.util.Random;

public class Cliente {
    Random aleatorio = new Random();

    private String nome;
    private String cpf;
    private int id;
    private long numeroTelefone;
    private int anoNascimeto;

    public Cliente(String nome, String cpf, long numeroTelefone, int anoNascimeto){
        this.nome = nome;
        this.cpf = cpf;
        this.id = aleatorio.nextInt(1000);
        this.numeroTelefone = numeroTelefone;
        this.anoNascimeto = anoNascimeto;
    }

    @Override
    public String toString() {
        return "Cliente [aleatorio=" + aleatorio + ", anoNascimeto=" + anoNascimeto + ", cpf=" + cpf + ", id=" + id
                + ", nome=" + nome + ", numeroTelefone=" + numeroTelefone + "]";
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getAnoNascimeto() {
        return anoNascimeto;
    }

    public void setAnoNascimeto(int anoNascimeto) {
        this.anoNascimeto = anoNascimeto;
    }
}
