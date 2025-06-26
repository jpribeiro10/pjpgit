package com.avaliacao.heranca;


public class TecnicoAdministrativo extends Funcionario {
 private double auxTransporte;
 private double auxAlimentacao;
 private String cargo;

 public TecnicoAdministrativo(String nome, String endereco, String telefone, String cpf, double salarioBase,
                              double auxTransporte, double auxAlimentacao, String cargo) {
     super(nome, endereco, telefone, cpf, salarioBase);
     this.auxTransporte = auxTransporte;
     this.auxAlimentacao = auxAlimentacao;
     this.setCargo(cargo);
 }

 
 public double calcSalario() {
     return salarioBase + auxTransporte + auxAlimentacao;
 }

 public double calcSalario(double quantHoras, double valorHora) {
     return calcSalario() + (quantHoras * valorHora);
 }


public String getCargo() {
	return cargo;
}


public void setCargo(String cargo) {
	this.cargo = cargo;
}
}

