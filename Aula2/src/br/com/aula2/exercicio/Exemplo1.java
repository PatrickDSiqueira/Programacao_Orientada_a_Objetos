/**
 * Exemplo1
 */

package br.com.aula2.exercicio;


public class Exemplo1 {
    public static void main(String[] args) {
        int x, y, num, soma;
        x=10;
        y=11;
        num = x++;
        System.out.println("x: " + x + "\ny:" + y + "\nnum:"+ num);

        soma = (x+y)-(++y);
        System.out.println("x: " + x + "\ny:" + y + "\nsoma:"+ soma);

    
}
}