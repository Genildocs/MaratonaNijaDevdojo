/* Comparando quanto de imposto é pago dependendo do salario.
Salario de 0 a 34.712 paga 9.70%
Salario de 34.713 a 68.507 paga 37.35%
Salario acima de 68.508 paga 49.50%
 */
import java.util.Scanner;

public class ExercicioCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salario: ");
        double salario = scanner.nextDouble();


        if ( salario <= 34712){
            System.out.print("Imposto pago é: " + Math.ceil(salario*(9.7/100)));
        }else if( salario == 34713 || salario <= 68507 ){
            System.out.print("Imposto pago é: " + Math.ceil(salario*(37.35/100)));
        }else{
            System.out.print("Imposto pago é: " + Math.ceil(salario*(49.50/100)));
        }



    }
}
