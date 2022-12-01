package br.com.pergunta1;

public class Publicacao {
    String dataPublicacao = "";
    String textoPublicacao = "";
    String linksMideia = "";
    public static double contadorPublicacao = 0;

    public Publicacao(String dataPublicacao, String textoPublicacao, String linksMideia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linksMideia = linksMideia;
        contadorPublicacao++;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinksMideia() {
        return linksMideia;
    }

    public void setLinksMideia(String linksMideia) {
        this.linksMideia = linksMideia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public static void setContadorPublicacao(double contadorPublicacao) {
        Publicacao.contadorPublicacao = contadorPublicacao;
    }

    @Override
    public String toString() {
        return "Publicacao [dataPublicacao=" + dataPublicacao + ", textoPublicacao=" + textoPublicacao
                + ", linksMideia=" + linksMideia + "]";
    }

    


    
}
