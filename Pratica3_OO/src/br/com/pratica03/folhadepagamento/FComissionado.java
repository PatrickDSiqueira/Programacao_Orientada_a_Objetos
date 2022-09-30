public class FComissionado extends Funcionario {
    private double percentual;
    private double vendas;


    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    @Override
    public double calcularProventos() {
        return super.calcularProventos() + (this.percentual * this.vendas);
    }





    



    
    
}
