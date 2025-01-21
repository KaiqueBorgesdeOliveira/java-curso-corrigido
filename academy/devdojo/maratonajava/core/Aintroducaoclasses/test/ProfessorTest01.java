package academy.devdojo.maratonajava.core.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.core.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Meste Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
