package br_com_pratica1_questao1_concessionaria;
import java.util.Date;
import java.util.Random;


public class Transacao {
    Random aleatorio = new Random();
    private Date dataRealizacao;
    private double valor;
    private int idTransacao;
    private Cliente destinatario;
    private Cliente remetente;
    
    public Transacao( double valor, Cliente destinatario, Cliente remetente){
        this.dataRealizacao = new Date();
        this.valor = valor; 
        this.idTransacao = aleatorio.nextInt();
        this.destinatario = destinatario;
        this.remetente = remetente;
    }
    
}
