package br.com.pratica04.containterface;

public class GeradorExtratos {
    public void geradorContas(Conta conta){
        System.out.println("Saldo Atual : " + conta.getSaldo());
    }
}
