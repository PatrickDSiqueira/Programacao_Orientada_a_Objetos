import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br_com_pratica1_questao1_concessionaria.Carro;
import br_com_pratica1_questao1_concessionaria.Cliente;
import br_com_pratica1_questao1_concessionaria.Textos;

public class App {
    static Scanner ler = new Scanner(System.in);
    static Cliente cliente1 = null, cliente2 = null;
    static Carro carro1 = null, carro2 = null;
    static Textos textos = new Textos();
    static String opcao = "";
    
    static List < Cliente > listaCliente = new ArrayList < Cliente >();

    public static void main(String[] args) {
        System.out.println(listaCliente.isEmpty());
        boolean saidaMenu = false;

        do {
            System.out.print(textos.getMenuOpcao());
                opcao = ler.next();

            switch (opcao) {
                case "1":
                cliente1 = CadastrarCliente();

                System.out.println("Deseja cadastrar outro cliente?");

                do {
                    System.out.print(textos.getMenuSimNao());
                    opcao = ler.next();
                    switch (opcao) {
                        case "1":
                                cliente2 = CadastrarCliente();
                                    // listaCliente[1] = cliente2;
                            break;
                        case "2":
                            break;
                        default:
                            System.out.println("Opcao inválida !");
                            break;
                        }
                } while (!(opcao != "1" || opcao != "2"));

                    break;

                case "2":
                        carro1 = CadastrarCarro();
                            // listaCarro[0] = carro1;
                        System.out.println("Deseja cadastrar outro carro?");
                        do {
                        System.out.print(textos.getMenuSimNao());
                        opcao = ler.next();
                        switch (opcao) {
                            case "1":
                                    carro2 = CadastrarCarro();
                                        // listaCarro[1] = carro2;
                                break;
                            case "2":
                                break;
                            default:
                                System.out.println("Opcao inválida !");
                                break;
                            }
                    } while (!(opcao != "1" || opcao != "2"));
                            

                    break;

                case "3": //  Transação
                    

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

        public static Cliente CadastrarCliente(){
            System.out.print("Nome : " );
                String nome = ler.next(); 

                System.out.print("CPF : " );
                String cpf = ler.next();  

                System.out.print("Numero de Telefone : " );
                long numeroTelefone = ler.nextLong(); 

                System.out.print("Ano de Nascimento : " );
                int anoNascimeto = ler.nextInt();

                System.out.println("Cliente cadastrado!");

                return  new Cliente(nome, cpf, numeroTelefone, anoNascimeto);
        }

        public static Carro CadastrarCarro(){
            System.out.print("marca : ");
                String marca = ler.next(); 
            System.out.print("Modelo : ");
                String modelo = ler.next(); 
            System.out.print("Ano : ");
                int ano = ler.nextInt(); 
            System.out.print("Valor : ");
                Double valor = ler.nextDouble();
            return new Carro(marca, modelo, ano, valor);
        }
    }
