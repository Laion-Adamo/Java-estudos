package academy.devdojo.maratonajava;

public class Aula05EstruturaCondicional01 {
    public static void main(String[] args){
//         idade < 15 categoria infantil
//         idade >= && idade < 18 categoria juvenil
//          idade >= 18 categoria adulto
        int idade = 20;
        String categoria;

//        if(idade < 12){
//            //System.out.println("Categoria Infantil");
//            categoria = "Categoria Infantil";
//        }else if(idade >= 15 && idade <= 18) {
//           // System.out.println("Categoria Juvenil");
//            categoria = "Categoria Juvenil";
//        }else{
//           // System.out.println("Categoria adulto");
//            categoria = "Categoria Adulto";
//        }
//        // Operação Ternaria do que esta escrito acima

        categoria = idade < 12 ? "Categoria Infantil" : idade >= 15 && idade <= 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}