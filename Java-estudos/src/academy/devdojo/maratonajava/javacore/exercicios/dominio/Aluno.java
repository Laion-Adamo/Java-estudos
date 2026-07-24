package academy.devdojo.maratonajava.javacore.exercicios.dominio;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int idade;
    private double[] notas;
    private static int totalAlunos;

    {
        System.out.println("Criando novo aluno...");
    }

    public Aluno(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
        totalAlunos++;
    }

    public Aluno(String nome, int idade, double[] notas) {
        this(nome, idade);
        this.setNotas(notas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Texto vazio");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Valor incorreto");
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }

    public void imprime() {
        imprime(true);
    }

    public void imprime(boolean mostrarNotas) {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (mostrarNotas) {
            System.out.println(Arrays.toString(this.notas));
        }

        System.out.println("Media: " + this.calculaMedia());
        System.out.println("Situacao: " + this.verificaSituacao());
    }

    public double calculaMedia() {
        if (this.notas == null || this.notas.length == 0) {
            return 0;
        }

        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }

        return media / this.notas.length;
    }

    public String verificaSituacao() {
        double media = calculaMedia();

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperacao";
        } else {
            return "Reprovado";
        }
    }
}
