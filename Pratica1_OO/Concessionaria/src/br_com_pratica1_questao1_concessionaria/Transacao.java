package br_com_pratica1_questao1_concessionaria;
import java.util.Date;

public class Transacao {
    private Date dataRealizacao;
    private double valor;
    private int idTransacao;
    private Cliente destinatario;
    private Cliente remetente;

    public Transacao( double valor, int idTransacao, Cliente destinatario, Cliente remetente){
        this.dataRealizacao = new Date();
        this.valor = valor; 
        this.idTransacao = idTransacao;
        this.destinatario = destinatario;
        this.remetente = remetente;
    }
    
}
