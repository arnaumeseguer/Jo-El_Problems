import java.util.Scanner;

public class HoEnteneuTotsSi {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        for (int i = 0; i < casos; i++) {
        String frase = ent.skip("[\r\n]*").nextLine();
        int posicio = ent.nextInt();

        System.out.println(frase.substring(0, posicio) + ", si?" + frase.substring(posicio));

        }

    }
}
