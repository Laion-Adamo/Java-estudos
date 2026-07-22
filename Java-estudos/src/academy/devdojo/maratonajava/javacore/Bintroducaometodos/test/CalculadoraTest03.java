package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNUmeros(20,0);


        double result2 = calculadora.divideDoisNUmeros02(20,0);


        calculadora.imprimeDivisaoDeDoisNumeros(81, 0);


        System.out.println(result);
        System.out.println(result2);
        System.out.println(calculadora);//endereço da memoria de onde busca
    }
}
