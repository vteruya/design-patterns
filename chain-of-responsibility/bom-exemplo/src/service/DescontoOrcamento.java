package service;

import domain.Orcamento;
import service.Desconto;

import java.math.BigDecimal;

public class DescontoOrcamento extends Desconto {

    public DescontoOrcamento(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.5"));
        }


        return proximo.calcular(orcamento);
    }
}
