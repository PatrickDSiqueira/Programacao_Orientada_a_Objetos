import java.util.Calendar;
import java.util.Scanner;

// package br.com.aula1.exemplo1;

public class Exercicio1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        int year = calendario.get(Calendar.YEAR);

        String placaCarro;
        int anoFabricacao = 0;

        System.out.println("Entre com a placa de um carro : ");
        placaCarro = ler.nextLine();
        System.out.println("Entre com o ano de fabricação : ");
        anoFabricacao = ler.nextInt();

        if (anoFabricacao <= 2010){
            System.out.println("Carro Velho");
        } else if(anoFabricacao <= 2021){
            System.out.println("Carro Semi Novo");
        } else if (year == anoFabricacao)  {
            System.out.println("Carro Novo");
        } else {
            System.out.println("Lançamento");
        }
        
        ler.close();

    }
}
