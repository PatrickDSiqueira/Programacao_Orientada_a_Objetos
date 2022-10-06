package br.com.pratica04.lojaComercial;

import javax.swing.JOptionPane;

public class Administrador extends Funcionario {
    private double horasExtras;
    private double salarioHora;

    public Administrador(String nome, String rg, double salarioBase, double horasExtras, double salarioHora) {
        super(nome, rg, salarioBase);
        this.horasExtras = horasExtras;
        this.salarioHora = salarioHora;
    }
    public Administrador(double horasExtras, double salarioHora) {
        this.horasExtras = horasExtras;
        this.salarioHora = salarioHora;
    }
    
    public void exibirSalario(){
        double salario = super.getSalarioBase()  + (getHorasExtras()  * (getSalarioHora() * 0.01));
        JOptionPane.showMessageDialog(null, "Salario mensal " + salario,"Salário" , 1);
        setHorasExtras(0);
    }

    public void adicionarHorasExtras (double hora){
setHorasExtras( getHorasExtras() + hora);
    }
    public double getHorasExtras() {
        return horasExtras;
    }
    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
    public double getSalarioHora() {
        return salarioHora;
    }
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    

    
}
