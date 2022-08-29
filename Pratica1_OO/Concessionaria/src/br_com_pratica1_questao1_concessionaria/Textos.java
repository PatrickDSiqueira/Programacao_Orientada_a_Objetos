package br_com_pratica1_questao1_concessionaria;

public class Textos {
    private String menuOpcao ;

    public Textos() {
        this.menuOpcao =  "1 - Cadastrar Cliente \n2 - Cadastrar Carro \n3 - Realizar Transação \n0 - Sair\nOpção - >";
    }


    public String getMenuOpcao() {
        return menuOpcao;
    }
}
