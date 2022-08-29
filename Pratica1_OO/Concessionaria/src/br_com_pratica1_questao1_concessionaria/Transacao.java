package br_com_pratica1_questao1_concessionaria;

public class Transacao {
    private String dataRealizacao;
    private double valor;
    private int idTransacao;
    private int idDestinatario;
    private int idRemetente;

    public Transacao(String dataRealizacao, double valor, int idTransacao, int idDestinatario, int idRemetente){
        this.dataRealizacao = dataRealizacao;
        this.valor = valor; 
        this.idTransacao = idTransacao;
        this.idDestinatario = idDestinatario;
        this.idRemetente = idRemetente;
    }
    
}
