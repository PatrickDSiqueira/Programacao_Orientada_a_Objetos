import java.util.Random;
import java.util.Scanner;

public class OperadoraAera {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        String nome="", cpf="", dataVoo="", horario="", menu="", horarioVoo="";
        int opcao=0, numeroVoo;

        
        menu = "1-CadastrarPassageiro  \n 2-Checkin \n 3-CancelarVoo \n 4-Sair \n --> " ;


        
        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                System.out.print("Nome do Passageirio : ");
                ler = new Scanner(System.in); // limpa a memoria do Scanner.
                    nome = ler.nextLine();
                System.out.println("CPF : ");
                    cpf = ler.nextLine();
                System.out.println("Data do Voo: ");
                    dataVoo = ler.nextLine();
                System.out.println("Horário do Voo : ");
                    horarioVoo = ler.nextLine();
                    numeroVoo = aleatorio.nextInt(999);
                    
                    System.out.println("Cadastro Efetuado com Sucesso " + numeroVoo);
                
                    break;

                case 2:

                ler = new Scanner(System.in); // limpa a memoria do Scanner.
                
                System.out.println("CPF : ");
                cpf = ler.nextLine();



                System.out.println("Numero do Voo : ");
                numeroVoo = ler.nextInt();

                System.out.println("Check in realizado com sucesso");

                    break;
                
                case 3:
                ler = new Scanner(System.in); // limpa a memoria do Scanner.
                
                System.out.println("CPF : ");
                cpf = ler.nextLine();



                System.out.println("Numero do Voo : ");
                numeroVoo = ler.nextInt();

                System.out.println("Voo Cancelado com sucesso");

                    break;

                case 4:
                System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
