package br_com_pratica1_questao2_empregoFaculdade;

import java.util.Scanner;

public class EmpregadoFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        double salario;
        int horasAula;
         
        System.out.println("Digite o nome do funcionario : ");
            nome  = ler.next();

        System.out.println("Digite o valor do salario deste funcionario : ");
            salario = ler.nextDouble();

         System.out.println("Digite as Horas Aulas deste funcionario : ");
            horasAula = ler.nextInt();

        EmpregadoFaculdade empregado1  = new EmpregadoFaculdade(nome, salario, horasAula);

        System.out.println("O valor do gasto com esse funcionário é : " + empregado1.getGastos());
        System.out.println(empregado1.getInfo());
      
        ler.close();
    }

    
    public EmpregadoFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos(){
        double bonus = 40;
        return this.salario + (bonus * horasAula);
    } 

    String getInfo(){
        return "nome:" + this.nome + " com salario " + getGastos();

    }

}
