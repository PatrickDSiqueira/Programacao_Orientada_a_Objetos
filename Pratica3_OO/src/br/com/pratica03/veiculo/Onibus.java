package br.com.pratica03.veiculo;

import javax.swing.JOptionPane;

public final class Onibus extends Veiculo {
    
    private int assentos;
    

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public Onibus (String placa, int ano, int assentos){

        super(placa, ano);

            this.assentos = assentos;
    }

    public void exibirDados(){

    JOptionPane.showMessageDialog(null, "Dados do ônibus: \n\nPlaca : " + getPlaca() + "\n Ano : " + getAno() + "\n Assentos : " + getAssentos(),"Mensagem", 1);

    }

    
}
