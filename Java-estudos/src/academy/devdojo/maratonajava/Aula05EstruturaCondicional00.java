package academy.devdojo.maratonajava;

public class Aula05EstruturaCondicional00 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutoriazadoComprarBebida = idade >= 18;

        if (isAutoriazadoComprarBebida) {
            System.out.println("Autorizado a Comprar bebida alcoolica.");
        }else{
            System.out.println("Proibido comprar bebida alcolica menor de idade");
        }

        if (!isAutoriazadoComprarBebida) ;
        {
            System.out.println("Proibido comprar bebida alcolica menor de idade");
        }

        System.out.println("fora do If");
    }
}
