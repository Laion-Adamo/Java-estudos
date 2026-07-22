package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominios;

public class Anime {
    private String nome;
    private int[] episodios;
    //ordem de inicialização:
   // 1- Alocado espaço em memoria pro objeto
    //2- Cada atriburo de classe é criado inicializando com valores default ou que for passada.
    //3- Bloco de inicialização é executada
    //4- Constutor é executado


    {
        //bloco de inicialização
        System.out.println("Dentro do bloco de inialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i]= i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

        for(int episodio: this.episodios){
            System.out.println(episodio +" ");
        }
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
