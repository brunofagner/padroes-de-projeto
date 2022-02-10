package br.com.dominio;

import java.math.BigDecimal;

import br.com.dominio.loja.LojinhaDoZe;
import br.com.dominio.modelo.Produto;
import br.com.dominio.venda.Venda;
import br.com.dominio.venda.VendaFactory;

public class Principal {
      public static void main(String[] args) {
            Produto produto = new Produto("cafe", 1, new BigDecimal(1000));

            VendaFactory factory = new LojinhaDoZe();

            Venda venda = new Venda(factory);
            venda.realizarVenda(produto);
      }
}
