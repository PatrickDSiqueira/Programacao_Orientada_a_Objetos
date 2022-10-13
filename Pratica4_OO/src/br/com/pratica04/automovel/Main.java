package br.com.pratica04.automovel;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String opcaoEscolhaMenu = "";

        do {

            opcaoEscolhaMenu = JOptionPane.showInputDialog(
                    null,
                    "\n<1> Cadastro Carro Popular\n<2> Calcular Preço\n<3> Sair",
                    "Menu",
                    0);

            switch (opcaoEscolhaMenu) {
                case "1":
                        
                    break;
                case "2":

                    break;
                case "3":

                    break;

                default:
                    break;
            }

        } while (!opcaoEscolhaMenu.equals("3"));

    } // Fim main

} // Fim Classe Main
