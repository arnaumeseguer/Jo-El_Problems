import java.util.Scanner;

public class PresidentPatata {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        int vegades;

        for (int i = 0; i < casos; i++) {
            vegades = ent.nextInt();
            for (int j = 0; j < vegades; j++) {
                System.out.println("No ofendre al president patata");
                if (j == vegades - 1) System.out.println();

            }

        }
    }
}
