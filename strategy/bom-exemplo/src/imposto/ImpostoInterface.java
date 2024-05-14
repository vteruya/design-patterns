package imposto;

import domain.Orcamento;


import java.math.BigDecimal;

public interface ImpostoInterface {
    public BigDecimal calcular(Orcamento orcamento);

}
