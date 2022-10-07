package br.com.pagamento;

public class CartaoCredito extends Pagamento {
    
    
    private String numCartao;
    private String baneiraCartao;
    private String titularCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao,
            String baneiraCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.baneiraCartao = baneiraCartao;
        this.titularCartao = titularCartao;
    }

    public CartaoCredito(String numCartao, String baneiraCartao, String titularCartao) {
        this.numCartao = numCartao;
        this.baneiraCartao = baneiraCartao;
        this.titularCartao = titularCartao;
    }

    @Override
    public String ImprimirCupomFiscal() {
        
        return super.ImprimirCupomFiscal() + "CartaoCredito [numCartao=" + numCartao + ", baneiraCartao=" + baneiraCartao + ", titularCartao="
                + titularCartao + "]";
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBaneiraCartao() {
        return baneiraCartao;
    }

    public void setBaneiraCartao(String baneiraCartao) {
        this.baneiraCartao = baneiraCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    



}
