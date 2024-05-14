package imposto;

import domain.Orcamento;
import imposto.ImpostoInterface;

import java.math.BigDecimal;

public class IcmsImplementacao implements ImpostoInterface {
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
