package academy.devdojo.maratonajava;

import java.lang.reflect.Member;

public class Aula05EstruturaCondicional02 {
    static void main(String[] args) {//psvm
        double salario = 3000;
        String mensagemDoar = "Eu vou Doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda Não tenho condição, mas vou ter!";

        //Operação Ternaria:
        String resultado =(salario > 5000) ? mensagemDoar : mensagemNaoDoar;

//        if(salario > 5000){
//            resultado = mensagemDoar;
//        }else{
//            resultado = mensagemNaoDoar;
//        }

        System.out.println(resultado); //sout
    }
}
