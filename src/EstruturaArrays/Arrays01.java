package EstruturaArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int [] idades = {11,25,50,60,80,75,64};

        for(int i=0; i < idades.length; i++){
//            System.out.println("Array de: " + idades.length + "posições");
            if(idades[i] % 2 == 0){
                System.out.println("Numeros pares dentro do array: " + idades[i]);
            }else{
                System.out.println("Numeros impares dentro do array: " + idades[i]);
            }
        }System.out.println("Array de: " + idades.length + " posições");

//        int [] idades2 = new int[5];
//        for(int i =0; i < idades2.length;i++){
//            System.out.println(i);
//
//        }

    }
}
