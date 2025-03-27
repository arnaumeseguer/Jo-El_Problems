import java.util.Scanner;

public class Divisors1a10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int nombre = ent.nextInt();

        if (nombre %2 == 0 && nombre %3 == 0 &&nombre %4 == 0 &&nombre %5 == 0 &&nombre %6 == 0 &&nombre %7 == 0 &&nombre %8 == 0 &&nombre %9 == 0) System.out.println("SI");
        else System.out.println("NO");
    }
}
