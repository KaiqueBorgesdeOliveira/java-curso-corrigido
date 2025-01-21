package academy.devdojo.maratonajava.core.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.core.Aintroducaoclasses.domain.Carro;

public class Lamborguini {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Lamborguini";
        carro.modelo = "Galardo";
        carro.ano = 2032;

        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano);
    }
}
