package Estruturas.Repeticao;
// while, do while e for
public class LacosDeRepeticoes {
    public static void main(String[] args) {
        //while
        System.out.print("Iniciando o while: \n" );
        int count = 0; // Criado um contador iniciando em zero.
        while(count <= 10){
            System.out.println(count); // imprimindo a contagem de zero a dez.
            count ++;  // incrementando o contador para o laço não ficar infinito.
        }
        // do while executa pelo menos uma vez, mesmo o bloco sendo false.

        // for
        System.out.print("\n");
        System.out.print("Iniciando o for: \n");

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
