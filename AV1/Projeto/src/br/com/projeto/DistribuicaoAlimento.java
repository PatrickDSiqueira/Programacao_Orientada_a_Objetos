package br.com.projeto;


public class DistribuicaoAlimento extends Projeto{
    
    private String descAlimento;
    private  float qtde;


    public DistribuicaoAlimento(String nomeProjeto, String descricao, String dataInicio, String dataFim,
            String descAlimento, float qtde) {
        super(nomeProjeto, descricao, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    @Override
    public boolean ValidaProjeto() {
        if (super.getDataFim().isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String ImprimeProjeto() {
        return null;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return " nomeProjeto=" + super.getNomeProjeto() + ", descricao=" + super.getDescricao() + ", dataInicio=" + super.getDataInicio()
        + ", dataFim=" + super.getDataFim() + "descAlimento=" + getDescAlimento() + ", qtde=" + getQtde();
    }
    
}
