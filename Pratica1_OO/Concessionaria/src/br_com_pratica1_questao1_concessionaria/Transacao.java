package br_com_pratica1_questao1_concessionaria;

public class Transacao {
    private String dataRealizacao;
    private double valor;
    private int idTransacao;
    private Cliente destinatario;
    private Cliente remetente;

    public Transacao(String dataRealizacao, double valor, int idTransacao, Cliente destinatario, Cliente remetente){
        this.dataRealizacao = dataRealizacao;
        this.valor = valor; 
        this.idTransacao = idTransacao;
        this.destinatario = destinatario;
        this.remetente = remetente;
    }
    
}
