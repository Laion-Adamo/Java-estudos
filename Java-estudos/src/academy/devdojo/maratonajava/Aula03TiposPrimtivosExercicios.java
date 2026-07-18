package academy.devdojo.maratonajava;
/*
Prática
Crie Variaveis para os campos descritos abaixo entre <> e imprima seguinte mensagem:
Eu <nome> morando no endereço <endereco>,
confirmo que recebi salario de <salario>, na data <data>

 */

public class Aula03TiposPrimtivosExercicios {
    public static void main(String[] args){
        String nome = "Adamo";
        String endereco = "Nova york";
        double salario = 2000 ;
        String dataRecebimentoSalario = "10/10/2005";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi salario de "+salario+" na data de "+dataRecebimentoSalario;
       System.out.print(relatorio);
    }

}
