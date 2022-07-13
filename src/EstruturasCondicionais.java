import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        //Estrutura de decisão IF / ELSE
        Scanner scanner = new Scanner(System.in);
        System.out.println("-> Primeiro exemplo de if, comparando se um numero é par ou impar:");
        System.out.print("Digite um numero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Esse numero é par!");
        }else{
            System.out.println("Esse numero é impar!");
        }

        System.out.println("-> Segundo exemplo de if, " +
                "comparando se uma pessoa pode ou não comprar bebidas de acordo com a idade.");
        System.out.print("Digite uma idade: ");
        int idade = scanner.nextInt();
        if(idade >= 18){
            System.out.println("Pode comprar bebida alcolica.");
        }else{
            System.out.println("Não pode comprar bebida alcolica.");
        }
    }
}

