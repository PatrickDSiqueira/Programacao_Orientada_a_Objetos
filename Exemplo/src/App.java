import java.text.NumberFormat;

import br.com.exemplo.banco.ContaCorrente;
import br.com.exemplo.banco.ContaPoupanca;


public class App {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente("1236-2",1000,5000);

        System.out.println("Saldo cc1 "+ cc1.getSaldo());
        System.out.println("Saldo total " + cc1.consultarSaldoTotal());
        
        ContaPoupanca cp1 = new ContaPoupanca("778-9", 1000, 2);

        System.out.println("Saldo : "+formatarValor(cc1.getSaldo()));

        cp1.CalcularRendimento();

        System.out.println("Saldo após o primeiro rendimento : "+cp1.getSaldo());
    }

    public static String formatarValor(double valor){
        return NumberFormat.getCurrencyInstance().format(valor);
}
}


