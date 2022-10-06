package br.com.pratica03.carnaval;

import java.text.NumberFormat;
// import java.util.Formatter;

public class Normal extends Ingresso {
    NumberFormat f = NumberFormat.getCurrencyInstance();

    public Normal(Double valor) {
        super(valor);
    }

    public void imprimeValorIngresso() {
        f.setMaximumFractionDigits(2);
        System.out.println("O valor do ingresso é : " + f.format(this.valor ) + " Ingresso Normal");
    }
}
