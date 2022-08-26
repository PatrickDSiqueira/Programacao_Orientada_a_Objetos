package br_com_pratica1_questao2_empregoFaculdade;

public class EmpregadoFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    double getGastos(){
        return this.salario;
    } 
    
    String getInfo(){
        return "nome:" + " com salario " + this.salario;
    }

}
