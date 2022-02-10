package br.com.dominio.modelo;

import java.math.BigDecimal;
public class Produto {
      private String nome;
      private int quantidade;
      private BigDecimal valorUnitario;

      public Produto(String nome, int quantidade, BigDecimal valorUnitario){
            this.nome = nome;
            this.quantidade = quantidade;
            this.valorUnitario = valorUnitario;
      }
      public double getValorTotal(double imposto){
            BigDecimal valorTotal = valorUnitario.add(new BigDecimal(imposto));
            valorTotal = valorUnitario.multiply(new BigDecimal(quantidade));
            return valorTotal.doubleValue();
      }

      public String getNome(){
            return this.nome;
      }
      public setNome(String nome){
            this.nome = nome;
      }

      public int getQuantidade() {
            return quantidade;
      }
      public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
      }

      public void setValorUnitario(BigDecimal valorUnitario) {
            this.valorUnitario = valorUnitario;
      }
      public BigDecimal getValorUnitario() {
            return valorUnitario;
      }
}
