import java.util.Scanner;

// package br.com.aula2.exercicio.br.com.aula2.exercicio;

// objeto é uma instancia da classe
// intancia é chamar o contrutor atraves do new
public class Banco {
   public static void main(String[] args) {
   
    long numero;
    int agencia;
    Double valor;

   Scanner ler = new Scanner(System.in);

   System.out.println("Digite o número da Conta :");
      numero = ler.nextLong();

   System.out.println("digite o numero da Agência :");
      agencia = ler.nextInt();

   ContaCorrente c1 = new ContaCorrente(numero, agencia);
   System.out.println(c1);

   System.out.println("Qual o valor a ser depositado: ");
      valor =  ler.nextDouble();

   c1.Depositar(valor);

   System.out.printf("Saldo: %.2f \n ", c1.ConsultaSaldo() );


   // c1 = new ContaCorrente(1234, 536);
   // c1.Depositar(1000);
   // System.out.println(c1.ConsultaSaldo());
    
 ler.close();
   } 
}
