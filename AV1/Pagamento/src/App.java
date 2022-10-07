import java.util.Date;

import br.com.pagamento.Pagamento;
import br.com.pagamento.Pix;

public class App {
    public static void main(String[] args) throws Exception {

        Pagamento p1 = new Pagamento(new Date().toString(), 25, 250);

        System.out.println(p1.ImprimirCupomFiscal());

        Pix pix1 = new Pix(new Date().toString(), 25, 250, false);
        
        System.out.println(pix1.ImprimirCupomFiscal());

        CartaoCredito cc1 = new CartaoCredito(null, 0, 0, null, "cvd", "Marcelo");

        cc1.ImprimirCupomFiscal();



    }
}
