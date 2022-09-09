package br.com.pratica2.rendimento;

public class Rendimento {
    public Double investimentoInicial; 
    public Double taxaMes;
    public int numeroMeses;

    public Rendimento (Double investimentoInicial, Double taxaMes, int numeroMeses)
    {
        this.investimentoInicial = investimentoInicial;
        this.taxaMes = taxaMes;
        this.numeroMeses = numeroMeses;
    }

}
