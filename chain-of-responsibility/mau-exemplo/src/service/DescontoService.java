package service;

import domain.Orcamento;

import java.math.BigDecimal;

public class DescontoService {

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.5"));
        }


        return BigDecimal.ZERO;
    }


}
