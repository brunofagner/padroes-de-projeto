package br.com.dominio.venda;

import br.com.dominio.NFE.NFE;
import br.com.dominio.boleto.Boleto;

public interface VendaFactory {

    public NFE criarNFE();

    public Boleto criarBoleto();
}