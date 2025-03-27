import java.util.Scanner;

public class Eleccions3{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int vots1 = ent.nextInt();
        int vots2 = ent.nextInt();
        int vots3 = ent.nextInt();

        if (vots1 > vots2 && vots1 > vots3) System.out.println("Jiden");
        else if (vots2 > vots1 && vots2 > vots3)System.out.println("Drump");
        else System.out.println("Banders");
    }
}
