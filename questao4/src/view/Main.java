package view;
import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        pagamento cartao = new cartaoCredito(1.2);
        pagamento chave = new pix(LocalDate.now(), true);
        pagamento internet = new boleto(1.3, true);

        cartao.processar(10);
        chave.processar(10);
        internet.processar(10);
    }
}
