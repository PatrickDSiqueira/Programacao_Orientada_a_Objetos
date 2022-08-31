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
}
