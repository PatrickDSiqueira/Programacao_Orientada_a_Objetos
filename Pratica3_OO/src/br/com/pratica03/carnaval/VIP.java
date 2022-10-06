package br.com.pratica03.carnaval;

import java.text.NumberFormat;

public class VIP extends Ingresso {
    Double valorAdicional;
    
    NumberFormat f = NumberFormat.getCurrencyInstance();


    public VIP(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeValorIngresso(){
        f.setMaximumFractionDigits(2);
        System.out.println("O valor do ingresso é " + f.format(this.valor + this.valorAdicional) + " Ingresso VIP");
    }
    public Double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public NumberFormat getF() {
        return f;
    }
    public void setF(NumberFormat f) {
        this.f = f;
    }
    
}
