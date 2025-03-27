import java.util.Scanner;

public class Bitlles1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        int bitlles = 0;

        for (int i = 0; i < casos; i++) {
            bitlles = 0;
            int files = ent.nextInt();
            for (int j = 1; j <= files; j++) {
                bitlles += j;
            }

            System.out.println(bitlles);

        }

    }
}
