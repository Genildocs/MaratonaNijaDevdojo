package POO.test;

import POO.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Marcio";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("Nome: "+ professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
