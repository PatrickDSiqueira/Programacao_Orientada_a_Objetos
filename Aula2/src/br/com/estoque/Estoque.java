package br.com.estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque (){};

    public Estoque (String nome, int qtdAtual, int qtdMinima)
    {
        this.nome  = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }
        // set
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual)
    {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima)
    {
        this.qtdMinima = qtdMinima;
    }
        //get
    
    public String getNome()
    {
        return this.nome;
    }

    public int getqtdMinima()
    {
        return this.qtdMinima;
    }

    public int getQtdAtual()
    {
        return this.qtdAtual;
    }
}


