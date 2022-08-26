package br_com_pratica1_questao2_empregoFaculdade;

public class EmpregadoFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    double getGastos(){
        double bonus = 40;
        return this.salario + (bonus * horasAula);
    } 

    String getInfo(){
        return "nome:" + " com salario " + getGastos();
    }

}
