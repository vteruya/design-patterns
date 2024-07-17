package service;

import domain.Orcamento;

import java.math.BigDecimal;

public class DescontoService {

    public BigDecimal calcular(Orcamento orcamento) {
    Desconto desconto = new DescontoItens(new DescontoOrcamento(new SemDesconto()));
    return desconto.calcular(orcamento);
    }


}
