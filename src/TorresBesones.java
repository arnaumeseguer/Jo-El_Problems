import java.util.Scanner;

public class TorresBesones {
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        double t1 = ent.nextDouble();
        double t2 = ent.nextDouble();

        if(Math.abs(t1 - t2) > 5) {
            System.out.println("NO");
        } else System.out.println("SI");
    }
}
