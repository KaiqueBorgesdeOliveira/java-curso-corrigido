package academy.devdojo.maratonajava.core.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.core.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Kaique";
        estudante.idade = 29;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
