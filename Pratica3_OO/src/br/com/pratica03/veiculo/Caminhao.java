package br.com.pratica03.veiculo;

import javax.swing.JOptionPane;

public final class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao (String placa, int ano, int eixos){

        super(placa, ano);

            this.eixos = eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void exibirDados(){

        super.exibirDados();

        JOptionPane.showMessageDialog(null, "Número de eixos : " + getEixos(), "Mensagem",1);

    }


    
}
