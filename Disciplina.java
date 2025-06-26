package com.avaliacao.heranca;

public class Disciplina {
 private String codigo;
 private String nome;
 private int cargaHoraria;

 public Disciplina(String codigo, String nome, int cargaHoraria) {
     this.setCodigo(codigo);
     this.nome = nome;
     this.setCargaHoraria(cargaHoraria);
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

public int getCargaHoraria() {
	return cargaHoraria;
}

public void setCargaHoraria(int cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}
}

