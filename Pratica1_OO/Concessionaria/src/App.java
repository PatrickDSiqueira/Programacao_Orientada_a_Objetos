import java.util.Scanner;

import br_com_pratica1_questao1_concessionaria.Cliente;
import br_com_pratica1_questao1_concessionaria.Textos;

public class App {
    public static void main(String[] args) throws Exception {
        Textos textos = new Textos();
        Scanner ler = new Scanner(System.in);
        String opcao = "";
        
        do {
            System.out.print(textos.getMenuOpcao());
                opcao = ler.next();
            switch (opcao) {
                case "1":
                System.out.print("Nome :" );
                String nome = ler.next(); 

                System.out.print("\nCPF :" );
                String cpf = ler.next();  

                System.out.print("\nNumero de Telefone :" );
                long numeroTelefone = ler.nextLong(); 

                System.out.print("\n Ano de Nascimento :" );
                int anoNascimeto = ler.nextInt();

                Cliente cliente1 = new Cliente(nome, cpf, numeroTelefone, anoNascimeto);


                    break;

                case "2":

                    break;

                case "3":

                    break;

                default:
                    System.out.println();
                    break;
            }
        } while ( opcao != "0" );
        ler.close();
    }
}
