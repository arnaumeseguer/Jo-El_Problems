import java.util.Scanner;

public class EtsJovequestionmark {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int edat = ent.nextInt();

        if (edat < 32) System.out.println("SI");
        else System.out.println("NO");
    }
}
