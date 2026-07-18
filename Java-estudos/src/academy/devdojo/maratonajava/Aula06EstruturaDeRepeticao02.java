package academy.devdojo.maratonajava;

public class Aula06EstruturaDeRepeticao02 {
    public static void main (String[] args){
        //imprima todos os numeros pares de 0 até 1000000


        for(long i=0; i < 100 ; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int count = 0;


        while(count < 100){
            count += 2;

            System.out.println(count);

        }
    }
}
