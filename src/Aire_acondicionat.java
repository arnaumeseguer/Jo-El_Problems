import java.util.Scanner;

public class Aire_acondicionat {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();
        int graus = 0;

        for (int i = 0; i < casos; i++) {
            graus = ent.nextInt();
            if (graus % 180 == 0) {
                System.out.println("OK");
            }
            else System.out.println("BRONCA");

        }
    }

}
