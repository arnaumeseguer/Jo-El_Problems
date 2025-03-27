import java.util.Scanner;

public class Dosx1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int nombre1 = ent.nextInt();
        int nombre2 = ent.nextInt();

        if (nombre1 == nombre2*2 || nombre2 == nombre1*2) System.out.println("SI");
        else System.out.println("NO");
    }
}
