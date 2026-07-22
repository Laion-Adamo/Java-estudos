package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro(); //valores
        Carro carro2 = new Carro();
        carro1.nome = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2002;



        carro2.nome = "Toyota";
        carro2.modelo = "Corrolla";
        carro2.ano = 2020;

        carro2 = carro1; // tira a referencia da memoria do carro2

        System.out.println(carro1.nome +"\n"+carro1.modelo +"\n" +carro1.ano);
        System.out.println(carro2.nome +"\n"+carro2.modelo +"\n" +carro2.ano);

      }
    }

