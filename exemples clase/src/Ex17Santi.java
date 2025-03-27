import java.util.Random;
import java.util.Scanner;
public class Ex17Santi {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r = new Random();
        int[][] m = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j] = r.nextInt(10));
            }
            System.out.println();

        }
        System.out.println("____________________________");
        System.out.println();

        //Anem a calcular la seuma dels veïns


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                //Tractament de la casella actual (m[i][j]
                int suma = 0;
                //Caselles exteriors
                if (i == 0 || i == m.length - 1 || j == 0 || j == m[i].length - 1) {
                    if (i == 0)
                        suma = m[i][j - 1] + m[i][j] + m[i][j + 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i + 1][j + 1];

                }
                //Caselles interiors
                else {

                    System.out.printf("%3d ", suma);

                }
                System.out.println();
            }
        }
    }
}