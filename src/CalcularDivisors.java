import java.util.Scanner;

public class CalcularDivisors {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int Casos = ent.nextInt();
        int Entrada = ent.nextInt();
        for (int i = 0; i < Casos ; i++) {
            for (int j = 0; j < Entrada; j++) {
                double Nombre = j % 2;
                if (Entrada % 2 == 0) System.out.println(j);
            }

        }
    }
}
