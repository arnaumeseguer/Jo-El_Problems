import java.util.Scanner;

public class MinutaHora {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int minuts = ent.nextInt();

        int hores = minuts/60;

        if (minuts%60 == 0) minuts = 0;
        else minuts = minuts -(hores*60);

        System.out.println(hores + ":" + minuts);
    }
}
