package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aluno;

public class AlunosTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Ana";
        aluno.idade = 20;
        aluno.notas = new double[]{8.5, 7.0, 9.5};

        aluno.imprime();

    }

}