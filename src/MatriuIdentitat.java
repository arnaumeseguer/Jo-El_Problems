import java.util.Scanner;
public class MatriuIdentitat {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //tant F com C formen el tamany de la matriu. Ara han de formar un quadrat, per això son iguals.
        int f = ent.nextInt();
        int c = f;

        //la mtriu

        int[][] matriu = new int[f][c];

        for (int i = 0; i < f ; i++) {
            for (int j = 0; j < f; j++) {
                matriu[i][j] = 0;
                if (i == j) {
                    matriu[i][j] = 1;
                } else {
                    matriu[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
    }
}

