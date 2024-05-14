import domain.Orcamento;
import enums.TipoImposto;
import service.ImpostoService;

import java.math.BigDecimal;

public class main {

    public static void main(String[] ars) {
        Orcamento orcamento = new Orcamento();
        orcamento.setValor(new BigDecimal("100"));
        ImpostoService impostoService = new ImpostoService();
        System.out.println(impostoService.calcular(orcamento, TipoImposto.ICMS));
    }
}
