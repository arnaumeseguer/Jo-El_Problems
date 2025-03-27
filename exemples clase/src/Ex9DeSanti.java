import java.util.Random;
import java.util.Scanner;
public class Ex9DeSanti {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Random r = new Random();
        int num = 0;
        int[] comptador = new int['Z' - 'A' + 1];
        char[] entrada;                 // Declaro el vector on guardare l'entrada. No l'instancia perque no se quantes caselles nessesitare
        boolean[] tractades = new boolean['Z' - 'A' + 1];        // Vectort per saber si hem tractat una lletra o no

        do {
            System.out.println("Introdueix un numero positiu:");
            num = ent.nextInt();
            if (num <= 0) System.out.println("El numeros ha de ser major que 0");
            else break;
        } while (true);

        entrada = new char[num];    //Quantes caselles nessecito instancia al vector
        for (int i = 0; i < num; i++) {
            int lletra = r.nextInt('Z' - 'A' + 1) + 'A';
            System.out.format("%c", (char) lletra);
            comptador[lletra - 'A']++; // generem el index del vector a partir de la lletra apareguda
            entrada[i] = (char) lletra;
        }
        System.out.println();

        // ;ostrem quantes vegades ha aparegut les lletres de l'entrada evitant repeticions
        for (int i = 0; i < entrada.length; i++) {
            if (!tractades[entrada[i] - 'A']) {
                System.out.format("La lletra %c ha sortit %d vegades.%n", entrada[i], comptador[entrada[i] - 'A']); //generem la lletra a partir del index aparegut
                tractades[entrada[i] - 'A'] = true;
            }
        }
    }
}