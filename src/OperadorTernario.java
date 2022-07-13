//Operador Ternario

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Não irei doar!";


        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.print(resultado);
    }
}
