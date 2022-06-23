import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // + - / * %
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int number1 = scanner.nextInt();
        System.out.print("Digite outro valor: ");
        int number2 = scanner.nextInt();
        int soma = number1 + number2;
        int subtracao = number1 - number2;
        int multiplicacao = number1 * number2;
        float divisao = number1 / number2;
        int modulo = number1 % number2;
        System.out.println("O valor da operação soma é: " + soma);
        System.out.println("O valor da operação subtracao é: " + subtracao);
        System.out.println("O valor da operação multiplicacao é: " + multiplicacao);
        System.out.println("O valor da operação divisao é: " + divisao);
        System.out.println("O resto da divisão é: " + modulo);

    }
}
