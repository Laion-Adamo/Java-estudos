package academy.devdojo.maratonajava;

public class Aula07Arrays03 {
    static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 ={1,2,3,4,5};
        int[] numeros3 = new int []{1,2,3};
        //For tradicional
        //  percorre, mas te dá o índice — então pode ler,
        // alterar, pular, ou ir de trás pra frente
      for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        //For-each
        // Só percorre e lê os valores, um por um porem não  pode alterar o array
        for (int sum : numeros3){
        System.out.println(sum);
        }
    }
}
