package br.com.pratica04.contaabstract;

public class Principal {
    public static void main(String[] args) {

        Conta cp = new ContaPoupanca();

        cp.setSaldo(2121);
        
        cp.imprimeExtrato();
    }
    
}
