package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }


    public void subraiDoisNumeros() {
        System.out.println(15 - 5);
    }


    public void multilicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);

    }


    public double divideDoisNUmeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2; // obriga retorno
    }


    public double divideDoisNUmeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {// mesma versão com else
            return num1 / num2;
        }
    }


    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("não existe divisão por zero");

        } else {
            System.out.println(num1 / num2);

        }
    }

    public void alternaDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1:" + numero1);
        System.out.println("Num2:" + numero2);

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }

}