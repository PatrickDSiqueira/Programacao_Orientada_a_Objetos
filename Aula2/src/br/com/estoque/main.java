package br.com.estoque;

public class main {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("caneta", 100, 1);

        System.out.println(estoque1.getNome());

        System.out.println("Produto " + estoque1.getNome() + "\n Quantidade Minima " + estoque1.getQtdAtual() + "\n Quantidade Atual " + estoque1.getQtdAtual());

        estoque1.setNome("Caneta Azul");
        System.out.println(estoque1.getNome());

        Estoque estoque2 = new Estoque();

        estoque2.setNome("Apagador");
        estoque2.setQtdAtual(10);
        estoque2.setQtdMinima(20);

        System.out.println("Produto " + estoque2.getNome() + "\n Quantidade Minima " + estoque2.getQtdAtual() + "\n Quantidade Atual " + estoque2.getQtdAtual());
    }
}
