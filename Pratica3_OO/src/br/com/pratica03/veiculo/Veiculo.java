package br.com.pratica03.veiculo;

public class Veiculo {
    
    private String placa;
    private int ano;

    public void veiculo(){
    }

    public void veiculo (String placa, int ano){
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
}
