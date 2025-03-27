import java.util.Scanner;
public class SumarFilesIColumnes {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        // Fet amb ChatGPT ja que em vaig perdre l'explicació per faltar

        // Llegim el nombre de files (F) i de columnes (C)
        int F = ent.nextInt();
        int C = ent.nextInt();

        // Creem la matriu
        int[][] matriu = new int[F][C];

        // Omplim la matriu amb els valors donats
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                matriu[i][j] = ent.nextInt();
            }
        }

        // Llegim l'índex k
        int k = ent.nextInt();

        // Calculem la suma de la fila k
        int sumaFila = 0;
        for (int j = 0; j < C; j++) {
            sumaFila += matriu[k][j];
        }

        // Calculem la suma de la columna k
        int sumaColumna = 0;
        for (int i = 0; i < F; i++) {
            sumaColumna += matriu[i][k];
        }

        // Mostrem la sortida
        System.out.println(sumaFila + " " + sumaColumna);

        ent.close();
    }
}



