package br.com.pratica04.containterface;

public class Principal {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(300);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.50);
        cp.sacar(25);

        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorContas(cc);
        gerador.geradorContas(cp);

    }
}
