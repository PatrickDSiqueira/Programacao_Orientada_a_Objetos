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
        return false;
    }

    @Override
    public String ImprimeProjeto() {
        return null;
    }
    
}
