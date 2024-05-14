package service;

import imposto.ImpostoStrategyInterface;
import domain.Orcamento;

import java.math.BigDecimal;

public class ImpostoService {

    public BigDecimal calcular(Orcamento orcamento, ImpostoStrategyInterface impostoInterface) {
       return impostoInterface.calcular(orcamento);
    }


}
