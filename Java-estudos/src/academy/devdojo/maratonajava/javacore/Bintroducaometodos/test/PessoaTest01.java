package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
      //  pessoa.nome = "Jiraya"; //sem private
        pessoa.setNome("Jiraya"); //com private
     //   pessoa.idade = 70;
        pessoa.setIdade(30); //com private


        //get= devolve ou obetem um valor
        //set = altera ou define um valor
        System.out.println(pessoa.getNome());
        //get e set = metodos publicos que controlam acesso atritubutos privados
        System.out.println(pessoa.getIdade());

      // pessoa.imprime();
    }
}
