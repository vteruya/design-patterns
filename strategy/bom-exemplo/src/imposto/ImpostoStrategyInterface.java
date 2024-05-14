package imposto;

import domain.Orcamento;


import java.math.BigDecimal;

public interface ImpostoStrategyInterface {
    public BigDecimal calcular(Orcamento orcamento);

}
