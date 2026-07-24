package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Marco", 12, new double[]{8, 7, 9});
        Aluno aluno1 = new Aluno("Joao", 11, new double[]{5, 6, 5});
        Aluno aluno2 = new Aluno("Maria", 9, new double[]{3, 4, 4});

        System.out.println("---------------------");
        aluno.imprime(true);
        System.out.println("---------------------");
        aluno1.imprime(false);
        System.out.println("---------------------");
        aluno2.imprime(true);
        System.out.println("---------------------");
        System.out.println("Total de Alunos: " + Aluno.getTotalAlunos());
    }
}
