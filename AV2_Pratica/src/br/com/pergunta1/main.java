package br.com.pergunta1;

import java.util.Date;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {

        String dataCriacao = new Date().toString();
        String nomeUsuario = JOptionPane.showInputDialog("Digite o seu nome ");
        String dataNascimento = JOptionPane.showInputDialog("Digite o sua data de nascimento ");
        String senha = JOptionPane.showInputDialog("Digite sua senha ");

        RedeSocial rede1 = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        String dataPublicacao = new Date().toString();
        String textoPublicacao = JOptionPane.showInputDialog("Digite o texto da publicacao");
        String linksMideia = JOptionPane.showInputDialog("Digite links da publicação");

        Publicacao publi = new Publicacao(dataPublicacao, textoPublicacao, linksMideia);

        dataPublicacao = new Date().toString();
        textoPublicacao = JOptionPane.showInputDialog("Digite o texto da publicacao");
        linksMideia = JOptionPane.showInputDialog("Digite links da publicação");

        publi = new Publicacao(dataPublicacao, textoPublicacao, linksMideia);

        rede1.inserePublicacao(publi);

        rede1.imprimePublicacoes();
    }
}
