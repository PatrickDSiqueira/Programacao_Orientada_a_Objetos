package br.com.aula2.exercicio;

/**
 * ContaCorrente
 */
public class ContaCorrente {
    private long numero;
    private int agengia;
    private Double saldo;

    ContaCorrente(long num, int ag){
        numero = num;
        agengia = ag;
        saldo = 0.;
    }


    public void Depositar (double valor){
        saldo += valor;
    }

    public void Sacar (double valor){
        if(valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insulficiente para o saque");
        }
    }

    public double ConsultaSaldo (){
        return saldo;
    }


 
}