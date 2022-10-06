package br.com.pratica03.veiculo;

import javax.swing.JOptionPane;

public  abstract class Veiculo {
    
    private String placa;
    private int ano;

    public Veiculo(){
        this.ano = 0;
        this.placa = "";
    }

    public Veiculo (String placa, int ano){
        this.ano = ano;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = Integer.parseInt(ano);
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "Dados do veículo: \n\nPlaca : " + this.placa + "\n Ano : " + this.ano,"Mensagem",1);
    }
}
