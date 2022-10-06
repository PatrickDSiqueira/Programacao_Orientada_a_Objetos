package br.com.pratica04.lojaComercial;

import javax.swing.JOptionPane;

public class Vendedor extends Funcionario{
    private double totalVendas;
    private final double comissao = 0.05;
    

    public Vendedor(String nome, String rg, double salarioBase, double valorvendas) {
        super(nome, rg, salarioBase);
        this.totalVendas = valorvendas;
    }

    public void acumularVendas (double venda){
        this.totalVendas += venda;
    }

    public void exibirSalario(){
        double salario = super.getSalarioBase()  + (getTotalVendas()  * getComissao());
        JOptionPane.showMessageDialog(null, "Salario mensal " + salario,"Salário" , 1);
        setTotalVendas(0);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

}
