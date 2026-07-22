package academy.devdojo.maratonajava.javacore.Dconstrutores.dominios;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios,String genero){// construtor obriga a passar algum dado antes de inicializar metodo

        this();// <-isso so funciona dentro de construtor e tambem deve ser o primeira linha do constutor;
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
                                //construtores tambem pode ter sobrecarga de construtores;
    }
    public Anime(String nome, String tipo, int episodios,String genero, String estudio) {// construtor obriga a passar algum dado antes de inicializar metodo
            //copia do constutor acima para incluir o estudio na relação
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    public Anime(){
        System.out.println("Construtor sem argumento");

    }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }



    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);


    }


    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }


    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }
}
