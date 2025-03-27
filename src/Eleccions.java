import java.util.Scanner;

public class Eleccions {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int vots1 = ent.nextInt();
        int vots2 = ent.nextInt();

        if (vots1 > vots2) System.out.println("Jiden");
        else System.out.println("Drump");
    }
}
