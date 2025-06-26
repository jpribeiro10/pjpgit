package com.avaliacao.heranca;


public class Aluno {
 private String nome;
 private String matricula;
 private String cpf;
 private Curso curso;

 public Aluno(String nome, String matricula, String cpf, Curso curso) {
     this.nome = nome;
     this.setMatricula(matricula);
     this.setCpf(cpf);
     this.setCurso(curso);
 }

 public String getNome() {
     return nome;
 }

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public Curso getCurso() {
	return curso;
}

public void setCurso(Curso curso) {
	this.curso = curso;
}
}

