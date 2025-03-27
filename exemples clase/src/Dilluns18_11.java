import java.util.Random;
import java.util.Scanner;
public class Dilluns18_11 {

    public static final int NUMCARES=6;    //Constant de nombres

    public static void main(String[] args) {

        Random r = new Random();
        int[] comptadorCares = new int[NUMCARES]; //comptador de cada cara

        //Simulem el llançament del dau K vegades (Ara 100)
        for (int i = 0; i < 100; i++) {
            int index = r.nextInt(NUMCARES);
            comptadorCares[index]++;

        }

        //Mirem quant ha surtit cada cara
        for (int i = 0; i < NUMCARES; i++) {
            System.out.printf("La cara %d ha sortit %d vegades.%n", i+1, comptadorCares[i]);
        }
    }
}

class GeneraLletres {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.format("%c%n",(char)(r.nextInt('z' - 'A') + 'A'));

        System.out.printf("%c %d%n", 'a', (int)'a');
        System.out.printf("%c %d%n", 'A', (int)'A');
        System.out.printf("%c %d%n", 'z', (int)'z');
        System.out.printf("%c %d%n", 'Z', (int)'Z');

        System.out.println('z' - 'A');
    }
}
