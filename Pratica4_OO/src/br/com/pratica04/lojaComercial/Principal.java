package br.com.pratica04.lojaComercial;

public class Principal {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Juan", "00000", 1500, 0);
        v1.acumularVendas(23);
        v1.acumularVendas(1500);
        v1.exibirSalario();


        Administrador a1 = new Administrador("Juliano","0000000", 25000, 0, 50);
        a1.adicionarHorasExtras(12);
        a1.adicionarHorasExtras(26);
        a1.adicionarHorasExtras(50);

        a1.exibirSalario();


    }
    
}
