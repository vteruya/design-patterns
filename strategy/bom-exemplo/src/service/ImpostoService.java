package service;

import imposto.ImpostoInterface;
import domain.Orcamento;

import java.math.BigDecimal;

public class ImpostoService {

    public BigDecimal calcular(Orcamento orcamento, ImpostoInterface impostoInterface) {
       return impostoInterface.calcular(orcamento);
    }


}
