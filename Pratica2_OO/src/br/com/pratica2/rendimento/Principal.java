package br.com.pratica2.rendimento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    static Scanner ler = new Scanner(System.in);
    static Rendimento rendimento1 = new Rendimento();
    static Double investimentoInicial; 
    static Double taxaMes;
    static int numeroMeses;
    
    public static void main(String[] args) {


        adicionarInvestimentoInicial();
        
        System.out.print("Taxa do Rendimento ( % a/m ): ");
            taxaMes = ler.nextDouble();
            rendimento1.setTaxaMes(taxaMes);

        System.out.print("Número de meses: ");
            numeroMeses = ler.nextInt();
            rendimento1.setNumeroMeses(numeroMeses);

            System.out.printf("O rendimento do investimento de R$ %.2f, com uma taxa de %1.0f%% a/m mês(es), durante %d será de R$ %.2f", rendimento1.getInvestimentoInicial(), rendimento1.getTaxaMes(), rendimento1.numeroMeses, rendimento1.calcularRemdimento() );
        
    }

    private static void adicionarInvestimentoInicial() 
    {   
        System.out.print("Investimento: R$ ");
        try { 
            investimentoInicial = ler.nextDouble(); 
            rendimento1.setInvestimentoInicial(investimentoInicial);
            limparScanner();
        } 
        catch (InputMismatchException exception) {
            limparScanner();
            System.out.println("Dado inválido" );
            adicionarInvestimentoInicial();
        }
    }

    private static void limparScanner() 
    { 
        ler = new Scanner(System.in);
    }
}
