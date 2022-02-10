package br.com.dominio.boleto;

import br.com.dominio.modelo.Produto;

public interface Boleto {
      
      public void emitir(Produto produto, double imposto);
}
