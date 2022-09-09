package br.com.pratica2.rendimento;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Rendimento rendimento1 = new Rendimento();

        Double investimentoInicial; 
        Double taxaMes;
        int numeroMeses;

        System.out.print("Investimento: R$ ");
            investimentoInicial = ler.nextDouble();
            rendimento1.setInvestimentoInicial(investimentoInicial);
        
        System.out.print("Taxa do Rendimento ( % a/m ): ");
            taxaMes = ler.nextDouble();
            rendimento1.setTaxaMes(taxaMes);

        System.out.print("Número de meses: ");
            numeroMeses = ler.nextInt();
            rendimento1.setNumeroMeses(numeroMeses);

            System.out.printf("O rendimento do investimento de R$ %.2f, com uma taxa de %1.0f%% a/m mês(es), durante %d será de R$ %.2f", rendimento1.getInvestimentoInicial(), rendimento1.getTaxaMes(), rendimento1.numeroMeses, rendimento1.calcularRemdimento() );
        
    }
}
