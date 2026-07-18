package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {
        //          + - / *  aritimetico
        int numeros01 = 20;
        int numeros02 = 20;
        double total = (numeros01 + numeros02);
        System.out.println(total);
        System.out.println(numeros02 + numeros01);
        //              % aritimetico
        float resto = 21 % 7;
        System.out.print(resto);

        //     < > <= >= == != boolean
        boolean isDezMaiorQueVinte = 10 < 20;
        boolean isDezMenorQueVinte = 10 > 20;
        boolean isDezIgualQueVinte = 20 == 20;

        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezIgualQueVinte);

        //operadores logico

        //  && (and) || (ou) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorDoQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorDoQueTrinta = idade < 30 && salario >= 3681;
        System.out.println("IsDentroDaLeiMaiorDoQueTrinta "+isDentroDaLeiMaiorDoQueTrinta);
        System.out.println("IsDentroDaLeiMenorDoQueTrinta "+isDentroDaLeiMenorDoQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlayStation  = 5000;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupança > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel "+isPlayStationCincoCompravel);

        // = += -= /= %= *=
        double bonus = 1800;
        bonus *= 2;
        bonus += 2;
        System.out.println(bonus);
        //
        int contador = 0;
        contador += 1;// contador = contador + 1
        contador++; // contador += 1
        contador--;
        ++contador; //++x → "primeiro aumenta, depois usa". x++ → "primeiro usa, depois aumenta".
        --contador;


    }
}
