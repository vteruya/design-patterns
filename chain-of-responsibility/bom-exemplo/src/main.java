import domain.Orcamento;
import service.DescontoService;

import java.math.BigDecimal;

public class main {

    public static void main(String[] ars) {
        Orcamento orcamentoUm = new Orcamento(BigDecimal.TEN, 10);
        Orcamento orcamentoDois = new Orcamento(new BigDecimal("1000"), 1);

        DescontoService impostoService = new DescontoService();
        System.out.println(impostoService.calcular(orcamentoUm));
        System.out.println(impostoService.calcular(orcamentoDois));

    }
}
