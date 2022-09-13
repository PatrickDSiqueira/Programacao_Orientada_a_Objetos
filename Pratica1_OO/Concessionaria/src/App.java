import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.pratica01.concessionaria.Carro;
import br.com.pratica01.concessionaria.Cliente;
import br.com.pratica01.concessionaria.LimpaConsole;
import br.com.pratica01.concessionaria.Textos;
import br.com.pratica01.concessionaria.Transacao;

public class App {
    static LimpaConsole limpar = new LimpaConsole();
    static Scanner ler = new Scanner(System.in);
    static Cliente cliente1 = null, cliente2 = null;
    static Carro carro1 = null, carro2 = null;
    static Textos textos = new Textos();
    static String opcao = "";
    static Transacao Transacao1 = null;

    static List < Cliente > listaClientes = new ArrayList < Cliente >();
    static List < Carro > listaCarros = new ArrayList < Carro >();
    static List < Transacao > listaTransacoes = new ArrayList < Transacao >();


    public static void main(String[] args) throws InterruptedException, IOException {
        limpar.Console();
        boolean saidaMenu = false;

        do {
                textos.mostrarMenuPrincipal();
                opcao = ler.next();
        limpar.Console();
                
            switch (opcao) {
                case "1":
                cliente1 = CadastrarCliente();
                    listaClientes.add(cliente1);
                System.out.println("Deseja cadastrar outro cliente?");

                do {
                    textos.mostrarSimNao();
                    opcao = ler.next();
                    switch (opcao) {
                        case "1":
                                cliente2 = CadastrarCliente();
                                    listaClientes.add(cliente2);
                                break;
                        case "2":
                            break;
                        default:
                            System.out.println("Opcao inválida !");
                            break;
                        }
                } while (!(opcao.equals("1")) && !(opcao.equals("2")));

                    break;

                case "2":
                        carro1 = CadastrarCarro();
                            listaCarros.add(carro1);
                        System.out.println("Deseja cadastrar outro carro?");
                        do {
                        textos.mostrarSimNao();
                        opcao = ler.next();
                        switch (opcao) {
                            case "1":
                                    carro2 = CadastrarCarro();
                                        listaCarros.add(carro2);
                                break;
                            case "2":
                                break;
                            default:
                                System.out.println("Opcao inválida !");
                                break;
                            }
                    } while (!(opcao.equals("1")) && !(opcao.equals("2")));
                            

                    break;

                case "3": 
                        FazerTransacao();
                    break;

                case "0":
                        saidaMenu = true;
                        System.out.println("Programa Finalizado!");

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while ( saidaMenu == false );
        ler.close();
        }

        public  static void FazerTransacao() {
            Cliente remetente = EscolherCliente("Quem é você :");
            Cliente destinatario = EscolherCliente("Quem será o favorecido : ");
            System.out.print("Qual será o valor : ");
            double valor = ler.nextDouble();

            new Transacao(valor, destinatario, remetente);

}
public static Cliente EscolherCliente(String args) {
    System.out.println(args);
    int op;
        for (int i = 0;  i < listaClientes.size(); i++) {
            System.out.println(i+" - "+listaClientes.get(i).getNome());
        }
        System.out.print("Opção - > ");
        op = ler.nextInt();
        if((op < 0) || (op > listaClientes.size() )){    
            System.out.println("opcao inválida");
            EscolherCliente(args);
        }else{
            return listaClientes.get(op);
        }

        return null;
    }

        public static Cliente CadastrarCliente(){
            System.out.print("Nome : " );
                String nome = ler.next(); 

                System.out.print("CPF : " );
                String cpf = ler.next();  

                System.out.print("Numero de Telefone : " );
                long numeroTelefone = ler.nextLong(); 

                System.out.print("Ano de Nascimento : " );
                int anoNascimento = ler.nextInt();

                System.out.print("Insira o endereço : ");
                    String endereco = ler.nextLine();

                System.out.print("Cliente cadastrado!");

                return new Cliente(nome, cpf, numeroTelefone, anoNascimento, endereco);
        }

        public static Carro CadastrarCarro(){
            System.out.print("Marca : ");
                String marca = ler.next(); 
            System.out.print("Modelo : ");
                String modelo = ler.next(); 
            System.out.print("Ano : ");
                int ano = ler.nextInt(); 
            System.out.print("Valor : ");
                Double valor = ler.nextDouble();
            System.out.print("Cor do Carro : ");
                String cor = ler.next();
            System.out.print("Chassi : ");
                String chassi = ler.next();
            return new Carro(marca, modelo, ano, valor,cor, chassi);
        }
    }
