package com.avaliacao.heranca;

public class UniversidadeTeste {
    public static void main(String[] args) {
        Curso curso = new Curso("C001", "Engenharia de Software");
        Disciplina disciplina = new Disciplina("D001", "POO", 60);

        Professor prof = new Professor("Ana", "Rua A", "9999-9999", "12345678900", 3000, 1000, 1500);
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Carlos", "Rua B", "8888-8888", "98765432100", 2000, 300, 400, "Secretário");

        Aluno aluno = new Aluno("João", "2021001", "11122233344", curso);

        System.out.println("Salário do Professor: R$ " + prof.calcSalario());
        System.out.println("Salário do Técnico (sem hora extra): R$ " + tecnico.calcSalario());
        System.out.println("Salário do Técnico (com hora extra): R$ " + tecnico.calcSalario(10, 50));
        System.out.println("Teste de commit teste");
    }
}

