package POO.test;

import POO.dominio.Carro;

public class ExercicioClasseCar {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Fiat";
        carro.modelo = "Uno";
        carro.ano = 2010;

        System.out.println("Classe Carro:");
        System.out.println("Marca do carro: "+ carro.marca + " modelo: "+ carro.modelo + " Ano: "+carro.ano);

        Carro carro2 = new Carro();

        carro2.marca = "Ford";
        carro2.modelo = "Fusion";
        carro2.ano = 2022;

        System.out.println("\n");
        System.out.println("Classe Carro2:");
        System.out.println("Marca do carro: "+ carro2.marca + " modelo: "+ carro2.modelo + " Ano: "+carro2.ano);
    }
}
