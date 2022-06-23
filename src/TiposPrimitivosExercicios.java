/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
 */

public class TiposPrimitivosExercicios {
    public static void main(String[] args){
        String nome = "Joaozinho";
        String endereco = "Rua dos bobos, s/n ";
        double salario = 5500.50;
        String dataRecebimentoSalario = "11/06/2022";
        String relatorio = "Eu " + nome+ ", morando no endereço: " + endereco + "" +
                ",confirmo que recebi o salario de R$" + salario + ", na data de " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
