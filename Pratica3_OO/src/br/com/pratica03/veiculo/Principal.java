package br.com.pratica03.veiculo;



public class Principal {


public static void main(String[] args) {

    Onibus o1 = new Onibus("ZAB-4613", 2009, 44);
    o1.exibirDados();

    Caminhao c1 = new Caminhao("ZAB-4613" , 2008, 2);
    c1.exibirDados();




}
}