package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;



public class Aluno {
    public String nome ;
    public int idade ;
    public double[] notas;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);


        if (notas == null) {
            return;
        }
        for(int i = 0; i < notas.length; i++) {
            System.out.println("nota " + (i+ 1)+ ": "+ notas[i]);
        }
        imprimeMediaNotas();
    }
    public void imprimeMediaNotas(){
        double media = 0;
        if(notas == null){
            return;
        }
        for(int j = 0; j < notas.length; j++){
           media += notas[j];
        }
        media /= notas.length;
        System.out.println("Media das Notas: " +media);

        }

    }




