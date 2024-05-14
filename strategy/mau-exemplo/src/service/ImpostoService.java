package service;

import enums.TipoImposto;
import domain.Orcamento;

import java.math.BigDecimal;

public class ImpostoService {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        switch (tipoImposto) {
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.6"));
            default:
                return BigDecimal.ZERO;
        }
    }


}
