package br_com_pratica1_questao3_notasAlunos;

public class Aluno {
    private String nome;
    private int matricula;
    private Double notaAV1;
    private Double notaAV2;
    private Double notaAE;
    private String curso;
    private int periodo;

    public Aluno(
        String nome, int matricula, Double notaAV1, Double notaAV2, Double notaAE, String curso, int periodo){
            this.nome = nome;
            this.matricula = matricula; 
            this.notaAV1 = notaAV1;
            this.notaAV2 = notaAV2;
            this.notaAE = notaAE;
            this.curso = curso;
            this.periodo = periodo;
    }

}
