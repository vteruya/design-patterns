### Tópicos

- [Definição do padrão Strategy](#definição-do-padrão-strategy)
- [Problema](#Problema)
- [Solução do problema](#solucão-do-problema)

### Definição do padrão Strategy

O Strategy é um padrão de projeto comportamental, através dele é possível um objeto escolher entre vários algoritmos e comportamentos em tempo de execução, ao invés de um único objeto estático. Dessa forma, o Strategy viabiliza extrair o comportamento de um objeto em classes separadas em tempo de execução ou não, assim, permite que o objeto seja mais flexível e reutilizável.

### Problema
Uma loja precisa calcular seus orçamentos com a princípio dois impostos ICMS e ISS, podendo ser um ou outro, e futuramente podem tem outros tipos de impostos.
Portanto, foi criado a classe ImpostoService.java, que calcula o imposto do orçamento de acordo com o tipo de imposto.


````
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
````
Desse modo, cada vez que aparece um novo tipo de imposto essa classe dobra de tamanho, dificultando manter a manutenção da classe.

### Solução
O padrão Strategy recomenda que seja extraído o algoritmo de uma única classe para outras classes separadas de estrategia.
Assim, para resolver o problema a partir desse padrão é necessário que o algoritmo seja retirado da classe ImpostoService.java, e seja criado uma interface de estrategia para que cada classe que irá representar um imposto possa implementa-la.

````
public class ImpostoService {

    public BigDecimal calcular(Orcamento orcamento, ImpostoStrategyInterface impostoInterface) {
       return impostoInterface.calcular(orcamento);
    }


}
````
É possível passar qualquer tipo de imposto que implementa a ImpostoStrategyInterface.class na assinatura do método:
````
public class IcmsStrategyImp implements ImpostoStrategyInterface {
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
````

````
public class IssStrategyImp implements ImpostoStrategyInterface {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
````
Dessa forma, a classe ImpostoService.java se torna independente das estrategias.
Então, fica viável  adicionar novos algoritmos ou modificar os existentes sem modificar o código da classe principal ou outras estratégias.



