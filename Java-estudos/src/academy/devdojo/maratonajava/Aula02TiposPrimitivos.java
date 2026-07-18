package academy.devdojo.maratonajava;

public class Aula02TiposPrimitivos {
    public static void main(String [] args){
        //types primitive: int, double float, char, byte, long, boolean
        int age = 10;
        long numeroGrande = (int) 100000000000L; //=cast
        double salarioDouble = 20000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = '\u0041';
        String texto = "não tem limites de texto string";
       // var nome2 = "vegeta";

        System.out.println("You age:"+age+"old");
        System.out.println(verdadeiro);
        System.out.println(caracter);
        System.out.println(idadeByte);
        System.out.println(numeroGrande);
        System.out.println("oi meu Nome é"+texto);
    }
}
