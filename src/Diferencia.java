import java.util.Scanner;

public class Diferencia {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

            int A = ent.nextInt();
            int B = ent.nextInt();
            if (A > B) System.out.println(A - B);
            else System.out.println(B - A);

        }
    }

