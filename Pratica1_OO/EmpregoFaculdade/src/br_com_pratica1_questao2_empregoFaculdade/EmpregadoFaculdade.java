package br_com_pratica1_questao2_empregoFaculdade;

public class EmpregadoFaculdade {
    private String nome;
    private double salario;
    private int horasAula;
    
    public EmpregadoFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    public double getGastos(){
        double bonus = 40;
        return this.salario + (bonus * horasAula);
    } 

    public String getInfo(){
        return "nome:" + this.nome + " com salario " + getGastos();

    }

}
