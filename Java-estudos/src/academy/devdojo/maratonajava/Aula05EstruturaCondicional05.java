package academy.devdojo.maratonajava;

public class Aula05EstruturaCondicional05 {
    public static void main(String[] args){
        //Ultilizando switch, dados os valores 1 a 7, imprima se o dia util ou final de semana
        //considerando 1 como domingo
        byte dia = 44;
        switch (dia){
            case 1:
            case 7:         //o uso do case é interessante quando são poucas opções no max 10
                System.out.println("FDS");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dias Uteis");
            break;
            default:
                System.out.println("Valor Incorreto");
        }
    }
}
