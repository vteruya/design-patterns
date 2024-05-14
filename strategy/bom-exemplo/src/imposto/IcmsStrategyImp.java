package imposto;

import domain.Orcamento;

import java.math.BigDecimal;

public class IcmsStrategyImp implements ImpostoStrategyInterface {
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
