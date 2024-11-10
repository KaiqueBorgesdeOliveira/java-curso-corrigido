package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    // byte, short, int, long, float, double 0
    // char '\u0000' ''
    // boolean false
    // String null
    public static void main(String[] args) {
        /* String[] teste = new String[3];
        System.out.println(teste[0]);
        System.out.println(teste[1]);
        System.out.println(teste[2]); */
        String[] nomes = new String[4];
        nomes[0] = "Kaique"; // Garbage Colector
        nomes[1] = "Verônica";
        nomes[2] = "Leila";
        nomes[3] = "Brenda";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
