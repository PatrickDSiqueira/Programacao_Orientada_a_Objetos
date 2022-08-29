package br_com_pratica1_questao1_concessionaria;

public class Cliente {
    private String nome;
    private String cpf;
    private int id;
    private long numeroTelefone;
    private int anoNascimeto;

    public Cliente(String nome, String cpf, int id, long numeroTelefone, int anoNascimeto){
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.numeroTelefone = numeroTelefone;
        this.anoNascimeto = anoNascimeto;
    }

    
}
