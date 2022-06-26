import java.util.Scanner;

public class SwtichCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Menu de opções:\n1 - Para contratar serviços\n2 - Para falar com atendente" +
                "\n3 - Para reclamações\n4 - Para Sair");
        System.out.print("Digite uma opção do menu: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Seja bem vindo! sua visita é um prazer");
                break;
            case 2:
                System.out.println("Algum problema?");
                break;
            case 3:
                System.out.println("Infelizmente todos os canais de atendimentos estao ocupados.");
                break;
            case 4:
                System.out.println("Sair!");
                break;
            default:
                System.out.println("Opcao invalida! Tente novamente");
                break;
        }
    }
}
