import java.util.Scanner;

public class DiguesPatata {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        String text = ent.nextLine();

        for (int i = 0; i < casos; i++) {
            text = ent.nextLine();
            System.out.println(text);

        }
    }
}
