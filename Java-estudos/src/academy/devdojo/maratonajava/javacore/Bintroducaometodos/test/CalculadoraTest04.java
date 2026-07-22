package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {
        Calculadora calculadora =new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alternaDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("num3:" +a);
        System.out.println("num4:" +b);
    }
}
