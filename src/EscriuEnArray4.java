import java.util.Scanner;
public class EscriuEnArray4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int llargada = ent.nextInt();
        int[] vector = new int[llargada];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = ent.nextInt();
            int suma = ent.nextInt();

            for (int j = 0; j < vector.length; j++) {
                System.out.println(vector[i] + suma);
            }
        }
    }
}
