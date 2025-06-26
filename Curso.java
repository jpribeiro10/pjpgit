package com.avaliacao.heranca;

public class Curso {
 private String codigo;
 private String nome;

 public Curso(String codigo, String nome) {
     this.setCodigo(codigo);
     this.nome = nome;
 }

 public String getNome() {
     return nome;
 }

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}
}

