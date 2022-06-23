import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        //Estrutura de decisão IF / ELSE
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Esse numero é par!");
        }else{
            System.out.println("Esse numero é impar!");
        }scanner.close();

        System.out.println("Segundo exemplo de if:");
        int idade = 15;
        if(idade >= 18){
            System.out.println("Pode comprar bebida alcolica.");
        }else{
            System.out.println("Não pode comprar bebida alcolica.");
        }
    }
}

