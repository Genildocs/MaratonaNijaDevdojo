package POO.test;

import POO.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); // Temos estudante como variavel de referencia para a classe Estudante e new construindo o objeto Estudante.
        estudante.idade = 19;
        estudante.sexo = 'M';
        estudante.nome = "Luff";

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
