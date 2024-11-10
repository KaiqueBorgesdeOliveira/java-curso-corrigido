package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        double resultado = num1 / (double) num2;
        System.out.println(resultado);

        // % resto

        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == ! Sempre retornam valor boolean

        boolean isDezMaiorqueVinte = 10 > 20;
        boolean isDezMenorqueVinte = 10 < 20;
        boolean isDezIgualaVinte = 10 == 20;
        boolean isDezIgualaDez = 10 == 10.0;
        boolean isDezDiferentedeDez = 10 != 10.0;

        System.out.println("É 10 maior que 20? "+isDezMaiorqueVinte);
        System.out.println("É 10 menor que 20? "+isDezMenorqueVinte);
        System.out.println("É 10 igual a 20? "+isDezIgualaVinte);
        System.out.println("É 10 igual a 10? "+isDezIgualaDez);
        System.out.println("É 10 diferente de 10? "+isDezDiferentedeDez);

        // && (and) || (or)

        int idade = 29;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Está dentro da Lei maior que trinta? " +isDentrodaLeiMaiorQueTrinta);
        System.out.println("Está dentro da Lei menor que trinta? " +isDentrodaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("O playstation 5 é comprável? " +isPlaystationCincoCompravel);

        // Operadores de atribuição = += -= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 1000;
        bonus /= 1000;
        bonus %= 1000;
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1; // Contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        int contador2 = 0;
        System.out.println(contador);
        System.out.println(++contador2);

    }
}
