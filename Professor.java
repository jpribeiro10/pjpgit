package com.avaliacao.heranca;


public class Professor extends Funcionario {
 private double valorDedicacaoExclusiva;
 private double retribTitulacao;

 public Professor(String nome, String endereco, String telefone, String cpf, double salarioBase,
                  double valorDedicacaoExclusiva, double retribTitulacao) {
     super(nome, endereco, telefone, cpf, salarioBase);
     this.valorDedicacaoExclusiva = valorDedicacaoExclusiva;
     this.retribTitulacao = retribTitulacao;
 }

 
 public double calcSalario() {
     return salarioBase + valorDedicacaoExclusiva + retribTitulacao;
 }
}
