import java.util.Scanner;

import br_com_pratica1_questao2_empregoFaculdade.EmpregadoFaculdade;

public class App {
    public static void main(String[] args) throws Exception {
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
}
