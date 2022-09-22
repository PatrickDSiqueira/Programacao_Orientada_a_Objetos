package br.com.pratica3.carnaval;

import java.util.Scanner;

public class Principal {

    static Scanner ler = new Scanner(System.in);

    static String option = "";
    static Double valor = null;
    static Double valorAdicional= null;
    static String localizacao = null;

    public static void main(String[] args) {

        do {
            System.out.println("Digite uma opção : ");
            System.out.println("\t(1) Ingresso Normal \n\t(2) VIP  \n\t(3) Camarote");
            System.out.print("\t   -> ");
                option = ler.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Digite o valor : ");
                    valor = ler.nextDouble();
                    ler = new Scanner(System.in);


                    Normal ingressoNormal = new Normal(valor);
                    ingressoNormal.imprimeValorIngresso();
                    ler = new Scanner(System.in);

                    break;

                case "2":
                    System.out.print("Digite o valor : ");
                    valor = ler.nextDouble();
                    ler = new Scanner(System.in);


                    System.out.print("Digite o valor adicional: ");
                    valorAdicional = ler.nextDouble();
                    ler = new Scanner(System.in);


                    VIP ingressoVIP = new VIP(valor, valorAdicional);
                    ingressoVIP.imprimeValorIngresso();
                    break;

                case "3":
                System.out.print("Digite o valor : ");
                valor = ler.nextDouble();
                ler = new Scanner(System.in);


                System.out.print("Digite o valor adicional: ");
                valorAdicional = ler.nextDouble();
                ler = new Scanner(System.in);


                System.out.print("Digite a localização: ");
                localizacao = ler.nextLine();
                ler = new Scanner(System.in);


                Camarote ingressoCamarote = new Camarote(valor, valorAdicional, localizacao);
                ingressoCamarote.imprimeValorIngresso();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (!option.equals("0"));
    }

}
