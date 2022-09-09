package br.com.estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque (){};

    public Estoque (String nome, int qtdAtual, int qtdMinima)
    {
        this.nome  = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }
        // set
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual)
    {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima)
    {
        this.qtdMinima = qtdMinima;
    }
        //get
    
    public String getNome()
    {
        return this.nome;
    }

    public int getqtdMinima()
    {
        return this.qtdMinima;
    }

    public int getQtdAtual()
    {
        return this.qtdAtual;
    }

    // method

        public void darBaixa(int qtde)
        {
            if (qtde < this.qtdAtual){
                this.qtdAtual -= qtde;
                System.out.println("O estoque agora é " + this.qtdAtual);
            }else{
                System.out.println("Não é possível realizar esta baixa, o estoque ficará negativa.");
            }
        }

        public String mostrar()
        {
            return " Produto " + this.nome + "\n Quantidade Minima " + this.qtdMinima + "\n Quantidade Atual " + this.qtdAtual;
        }
        
        public boolean precisaRepor()
        {
            if (this.qtdAtual <= this.qtdMinima)
            {
                return true;
            } else 
            {
                return false;
            }

        }

    }


