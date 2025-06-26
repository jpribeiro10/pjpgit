package com.avaliacao.heranca;


public abstract class Funcionario {
protected String nome, endereco, telefone, cpf;
protected double salarioBase;


public Funcionario(String nome2, String endereco2, String telefone2, String cpf2, double salarioBase2) {
	// TODO Auto-generated constructor stub
}


public abstract double calcSalario();
}

