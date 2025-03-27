import java.util.Scanner;
import java.util.Random;
public class Ex16DeSanti {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r = new Random();

        int f = 5;
        int c = 10;

        int[][] matriu = new int[f][c];
        int[] sumafiles = new int[f];
        int[] sumacolumnes = new int[c];


        for (int i = 0; i < f ; i++) {
            for (int j = 0; j < c ; j++) {
                matriu[i][j] = r.nextInt(101);
                sumafiles[i] += matriu[i][j];
                sumacolumnes[j] += matriu[i][j];
                System.out.format("%4d", matriu[i][j]);

            }
            System.out.println();

        }

        for (int i = 0; i < sumafiles.length; i++) System.out.printf("%4d", sumafiles[i]);

        System.out.println();
        for (int i = 0; i < sumafiles.length; i++) System.out.printf("%4d", sumafiles[i]);


    }
}
