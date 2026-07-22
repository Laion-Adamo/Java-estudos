package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominios.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //metodo init para criar as variaveis com argumentos, com mais facildiade:
        anime.init("Akudama Driver", "TV", 12, "Ação");
        //      anime.setGenero("Ação");
//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprime();
    }
}
