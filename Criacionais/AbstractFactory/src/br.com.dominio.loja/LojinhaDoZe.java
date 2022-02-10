package br.com.dominio.loja;
import br.com.dominio.NFE.NFE;
import br.com.dominio.NFE.NFEGoias;
import br.com.dominio.boleto.Boleto;
import br.com.dominio.boleto.BoletoBancoBrasil;
import br.com.dominio.venda.VendaFactory;

public class LojinhaDoZe implements VendaFactory{

      @Override
      public NFE criarNFE() {
            NFE notaFiscal = new NFEGoias();
            return notaFiscal;
      }

      @Override
      public Boleto criarBoleto() {
            Boleto boleto = new BoletoBancoBrasil();

            return boleto;
      }
      
}
