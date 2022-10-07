package br.com.mensalidade;


public class Mensalidade {
    private double valorMensalidade;
    private int numeroIrmaos;

    public Mensalidade(double valorMensalidade, int numeroIrmaos) {

        this.valorMensalidade = valorMensalidade;
        this.numeroIrmaos = numeroIrmaos;
    }
    
            public double calculaMensalidade(){

            if (this.numeroIrmaos == 1 ){
            this.valorMensalidade = valorMensalidade  * 0.95;
            return  valorMensalidade;
            }

             else if (this.numeroIrmaos == 2){
            this.valorMensalidade = valorMensalidade  * 0.9;
            return  this.valorMensalidade;
             }

        
                else if (this.numeroIrmaos > 2) { 
                this.valorMensalidade = valorMensalidade  * 0.85;
                return this.valorMensalidade;
                }

            else {
                return this.valorMensalidade;
            }

         }
    }
    