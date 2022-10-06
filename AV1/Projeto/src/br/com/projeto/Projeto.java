package br.com.projeto;

public abstract class Projeto {
    private String nomeProjeto; 
    private String descricao;
    private String dataInicio; 
    private String dataFim;

    public Projeto(String nomeProjeto, String descricao, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    } 

    public abstract boolean ValidaProjeto();

    public abstract String ImprimeProjeto();
    
}
