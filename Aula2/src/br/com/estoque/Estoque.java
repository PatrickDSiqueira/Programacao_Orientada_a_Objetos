package br.com.estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque (String nome, int qtdAtual, int qtdMinima)
    {
        this.nome  = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }
}
