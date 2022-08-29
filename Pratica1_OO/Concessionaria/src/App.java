import java.util.Scanner;

import br_com_pratica1_questao1_concessionaria.Cliente;
import br_com_pratica1_questao1_concessionaria.Textos;

public class App {
    public static void main(String[] args) throws Exception {
        Textos textos = new Textos();
        Scanner ler = new Scanner(System.in);
        String opcao = "";
        boolean saidaMenu = false;
        
        do {
            System.out.print(textos.getMenuOpcao());
                opcao = ler.next();
            switch (opcao) {
                case "1":
                System.out.print("Nome : " );
                String nome = ler.next(); 

                System.out.print("\nCPF : " );
                String cpf = ler.next();  

                System.out.print("\nNumero de Telefone : " );
                long numeroTelefone = ler.nextLong(); 

                System.out.print("\nAno de Nascimento : " );
                int anoNascimeto = ler.nextInt();

                Cliente cliente1 = new Cliente(nome, cpf, numeroTelefone, anoNascimeto);


                    break;

                case "2":

                    break;

                case "3":

                    break;
                case "0":
                        saidaMenu = true;
                        System.out.println("Programa Finalizado!");
                        System.out.println(saidaMenu);

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while ( saidaMenu == false );
        ler.close();
    }
}
