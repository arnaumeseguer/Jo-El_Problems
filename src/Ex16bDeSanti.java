import java.util.Random;
import java.util.Scanner;

public class Ex16bDeSanti {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r = new Random();
        int f;
        int c;

        //demanem els rangs dels valors de la matriu
        do {
            System.out.println("Introdueix el valor inferior del rang (>=0)");
             f = ent.nextInt();
            if (f < 0) System.out.println("ha de ser més gran que 0!");
            else break;
        }while (true);

        do {
            System.out.println("Introdueix el valor superior del rang (>=5)");
             c =ent.nextInt()+1;
            if (c < 5) System.out.println("ha de ser més gran que 5!");
            else break;
        }while (true);

        if (f > c) {
            int t;
            t = c;
            c = f;
            f = t;
        }

        int[][] matriu = new int[5][10];
        int[] compt = new int[c - f];
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length ; j++) {
                int num= r.nextInt(c - f);
                matriu[i][j] = num;
                System.out.printf("%4d", matriu[i][j]);
                compt[num-f]++;
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < compt.length; i++) {
            System.out.format(" %d  %d %n",i+f,compt[i]);
        }
    }
}
