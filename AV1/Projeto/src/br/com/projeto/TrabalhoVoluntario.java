package br.com.projeto;

public class TrabalhoVoluntario extends Projeto {

    private String tipoTrabalho;

    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String dataInicio, String dataFim,
            String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean ValidaProjeto() {
        return false;
    }

    @Override
    public String ImprimeProjeto() {
        return null;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }
}
