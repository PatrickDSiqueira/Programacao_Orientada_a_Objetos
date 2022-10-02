package br.com.pratca04.contaabstract;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimeExtrato() {
        System.out.println("###  Extrato da Contas ###");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/aaaa");
        Date date = new Date();

        System.out.println("Saldo : "+ this.getSaldo());
        System.out.println("Data : "+sdf.format(date));

    }
    
}
