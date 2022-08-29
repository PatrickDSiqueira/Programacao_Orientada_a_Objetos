package br_com_pratica1_questao1_concessionaria;

public class Textos {
    private String menuOpcao ;
    private String menuSimNao;

    public Textos() {
        this.menuOpcao =  "1 - Cadastrar Cliente \n2 - Cadastrar Carro \n3 - Realizar Transação \n0 - Sair\nOpção - >";
        this.menuSimNao = "1 - Sim \n2 - Não\nOpção - >";
    }


    public String getMenuOpcao() {
        return menuOpcao;
    }

    public String getMenuSimNao(){
        return menuSimNao;
    }
}
