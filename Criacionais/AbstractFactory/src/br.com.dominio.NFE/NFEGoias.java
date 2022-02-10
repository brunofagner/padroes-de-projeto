package br.com.dominio.NFE;

import java.math.BigDecimal;

import br.com.dominio.modelo.Produto;

public class NFEGoias implements NFE{

      @Override
      public double calcularImposto(Produto produto) {
            BigDecimal imposto = new BigDecimal("0.18");
            imposto = imposto.multiply(produto.getValorUnitario());


            return imposto.doubleValue();
      }
      
}
