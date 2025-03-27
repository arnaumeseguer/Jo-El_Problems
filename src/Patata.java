import java.util.Scanner;

public class Patata {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();
        String text = ent.nextLine();

        for (int i = 0; i < casos; i++) {
            text = ent.nextLine();
            if (text.equalsIgnoreCase("patata")) System.out.println("Es Patata");
            else System.out.println("No es Patata");

        }
    }
}
