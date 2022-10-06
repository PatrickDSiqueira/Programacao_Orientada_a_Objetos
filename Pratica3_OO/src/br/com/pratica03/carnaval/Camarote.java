package br.com.pratica03.carnaval;

import java.text.NumberFormat;

public class Camarote  extends Ingresso{

    public Camarote(Double valor, Double valorAdicional, String localizacao) {
        super(valor);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }


    Double valorAdicional;
    String localizacao;



    NumberFormat f = NumberFormat.getCurrencyInstance();


    public void imprimeValorIngresso() {
        f.setMaximumFractionDigits(2);
        System.out.println("O valor do ingresso é : " + f.format(this.valor + this.valorAdicional) + " Localizacao : "
                + this.localizacao + " Ingresso Camarote");
    }


    public Double getValorAdicional() {
        return valorAdicional;
    }


    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }


    public String getLocalizacao() {
        return localizacao;
    }


    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    public NumberFormat getF() {
        return f;
    }


    public void setF(NumberFormat f) {
        this.f = f;
    }

}
