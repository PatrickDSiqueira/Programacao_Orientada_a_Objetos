package br.com.pratica2.rendimento;

import java.text.NumberFormat;

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

    public Rendimento()
    {}

    public Double getInvestimentoInicial() 
    {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(Double investimentoInicial) 
    {
        this.investimentoInicial = investimentoInicial;
    }

    public Double getTaxaMes() 
    {
        return taxaMes;
    }

    public void setTaxaMes(Double taxaMes) 
    {
        this.taxaMes = taxaMes;
    }

    public int getNumeroMeses() 
    {
        return numeroMeses;
    }

    public void setNumeroMeses(int numeroMeses) 
    {
        this.numeroMeses = numeroMeses;
    }

    public void calcularRendimento(){
        Double rendimentoMes= this.investimentoInicial;
        System.out.println("Valor Inicial:" + NumberFormat.getCurrencyInstance().format(rendimentoMes));

        for (int i = 0; i < getNumeroMeses(); i++) {

                rendimentoMes += rendimentoMes * getTaxaMes()/100;  

            System.out.printf("\t Mês %d: \t %s \n", i++, NumberFormat.getCurrencyInstance().format(rendimentoMes) );
        }
            
    }
}
