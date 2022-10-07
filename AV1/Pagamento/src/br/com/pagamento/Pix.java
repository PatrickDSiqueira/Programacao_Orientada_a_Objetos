package br.com.pagamento;

public class Pix extends Pagamento {

    private boolean comprovanteTransaçãoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransaçãoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransaçãoPix = comprovanteTransaçãoPix;
    }

    public Pix(boolean comprovanteTransaçãoPix) {
        this.comprovanteTransaçãoPix = comprovanteTransaçãoPix;
    }

    @Override
    public String ImprimirCupomFiscal() {
        return super.ImprimirCupomFiscal()+ "Pix [comprovanteTransaçãoPix=" + comprovanteTransaçãoPix + "]";
    }

    public boolean isComprovanteTransaçãoPix() {
        return comprovanteTransaçãoPix;
    }

    public void setComprovanteTransaçãoPix(boolean comprovanteTransaçãoPix) {
        this.comprovanteTransaçãoPix = comprovanteTransaçãoPix;
    }


    
    
}

