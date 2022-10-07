import br.com.mensalidade.Mensalidade;

public class App {
    public class Main {

        public static void main(String[] args) {

            
                Mensalidade aluno1 = new Mensalidade(100, 1);
    
                System.out.println("O valor da sua mensalidade é " + aluno1.calculaMensalidade());


                Mensalidade aluno2 = new Mensalidade(100, 2);
    
                System.out.println("O valor da sua mensalidade é " + aluno2.calculaMensalidade());


                Mensalidade aluno3 = new Mensalidade(100, 5);
    
                System.out.println("O valor da sua mensalidade é " + aluno3.calculaMensalidade());


                Mensalidade aluno4 = new Mensalidade(100, 0);
    
                System.out.println("O valor da sua mensalidade é " + aluno4.calculaMensalidade());
        }
        
    }
}
