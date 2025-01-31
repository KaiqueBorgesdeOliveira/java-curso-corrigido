package academy.devdojo.maratonajava.core.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.core.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fuscão Preto";
        carro1.modelo = "Renegade";
        carro1.ano = 1945;

        carro2.nome = "Maréa";
        carro2.modelo = "Sportage";
        carro2.ano = 1892;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
