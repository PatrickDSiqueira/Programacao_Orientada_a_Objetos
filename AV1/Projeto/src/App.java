import javax.swing.JOptionPane;

import br.com.projeto.DistribuicaoAlimento;
import br.com.projeto.TrabalhoVoluntario;

public class App {
    public static void main(String[] args) throws Exception {
    String menu = "<1> Cadastrar Projeto Distribuir Alimentos \n<2> Cadastrar Projeto Trabalho Voluntário \n<3> Sair";

    String opcao = "";

    do {
        opcao = JOptionPane.showInputDialog(null, menu);

        String nomeProjeto ;
        String descricao ;
        String dataInicio ;
        String dataFim ;
        String descAlimento ;
        float qtde;
        int duracaoTrabalho;
        String tipoTrabalho;

         switch (opcao) {

            case "1":

            nomeProjeto = JOptionPane.showInputDialog(null, "Nome do projeto : ");
            descricao = JOptionPane.showInputDialog(null, "Descrição do projeto : ");
            dataInicio = JOptionPane.showInputDialog(null, "Data inicio do projeto  : ");
            dataFim  = JOptionPane.showInputDialog(null, "Data Fim do projeto : ");
            descAlimento = JOptionPane.showInputDialog(null, "Descrição do alimento : ");
            qtde = Float.parseFloat( JOptionPane.showInputDialog(null, "Quantidade de alimento : "));

                  DistribuicaoAlimento d1 = new DistribuicaoAlimento( nomeProjeto, descricao, dataInicio,  dataFim,
                     descAlimento, qtde);

                     JOptionPane.showMessageDialog(null,"Projeto validado : " + d1.ValidaProjeto() , "Validação de Projeto", 1);

                     JOptionPane.showMessageDialog(null,"Projeto : " + d1.ImprimeProjeto() , "Impressão do projeto", 1);

                break;

                case "2":

            nomeProjeto = JOptionPane.showInputDialog(null, "Nome do projeto : ");
            descricao = JOptionPane.showInputDialog(null, "Descrição do projeto : ");
            dataInicio = JOptionPane.showInputDialog(null, "Data inicio do projeto  : ");
            dataFim  = JOptionPane.showInputDialog(null, "Data Fim do projeto : ");
            tipoTrabalho= JOptionPane.showInputDialog(null, "Tipo de trabalho : ");
            duracaoTrabalho = Integer.parseInt( JOptionPane.showInputDialog(null, "Duração do Trabalho : "));

                    TrabalhoVoluntario t1 = new TrabalhoVoluntario(nomeProjeto, descricao, dataInicio, dataFim, tipoTrabalho, duracaoTrabalho);

                     JOptionPane.showMessageDialog(null,"Projeto validado : " + t1.ValidaProjeto() , "Validação de Projeto", 1);

                     JOptionPane.showMessageDialog(null,"Projeto : " + t1.ImprimeProjeto() , "Impressão do projeto", 1);
                break;

         
            default:
            JOptionPane.showMessageDialog(null, "Opção errada", "Alerta", 2);
                break;
         }
        
    } while (!opcao.equals("3"));


    }
}
