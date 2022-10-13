package br.com.pratica04.automovel;

public class Popular extends Automovel {
    private double percentagemDecimalDesconto;

    public Popular(double percentagemDecimalDesconto) {
        this.percentagemDecimalDesconto = percentagemDecimalDesconto;
    }
    

    public double getPercentagemDecimalDesconto () {
        return percentagemDecimalDesconto;
    }

    public void setPercentagemDecimalDesconto(double percentagemDecimalDesconto) {
        this.percentagemDecimalDesconto = percentagemDecimalDesconto;
    }

    public Double calcularPrecoFinalPopular(){
        return null;
    }
}
