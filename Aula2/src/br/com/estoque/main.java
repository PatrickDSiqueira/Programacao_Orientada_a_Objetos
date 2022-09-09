package br.com.estoque;

public class main {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("caneta", 100, 1);

        System.out.println(estoque1.getNome());

        System.out.println("Produto " + estoque1.getNome() + "\n Quantidade Minima " + estoque1.getQtdAtual() + "\n Quantidade Atual " + estoque1.getQtdAtual());

        estoque1.setNome("Caneta Azul");
        System.out.println(estoque1.getNome());
    }
}
