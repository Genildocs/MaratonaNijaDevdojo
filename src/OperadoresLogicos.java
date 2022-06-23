public class OperadoresLogicos {
    public static void main(String[] args) {

         /*Operador logico AND (&&) Retorna true se duas condições logicas forem verdadeiras.
        Operador logico OR (||) Retorna true se uma ou as duas  condições logicas forem verdadeiras e false se as
        duas condições forem falsas.
        Operador OR (!) operador de negação logica, se é verdade retorna falso e vice-versa.
         */

        int idade = 18;
        float salario = 2500F;

        boolean negacaoLogica = !(idade > 30);
        System.out.println("Negação logica retornou: " + negacaoLogica + " , mesmo sendo uma condição falsa.");

        boolean negacaoLogica2 = !(idade == 18);
        System.out.println("Negação logica retornou: " + negacaoLogica2 + " , mesmo sendo uma condição verdadeira.");

        if (idade == 18 && salario == 2500) {
            System.out.println("Verdade, pois as duas condições são verdadeiras.");
        }

        if (idade != 18 || salario != 2500) {
            System.out.println("Verdade, caso uma ou as duas condições sejam verdadeiras.");
        }else{
            System.out.println("Falso, caso as duas condições sejam falsa.");
        }
        //Operadores de atribuição = += -= *= /= %=
        double bonus = 1800; // 1800
        System.out.println(bonus);
        bonus += 1000; // 2800
        System.out.println(bonus);
        bonus -= 1000; // 1800
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);
    }
}