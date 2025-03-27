import java.util.Scanner;

public class EtsJove2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int joves = 0;


        int edat1 = ent.nextInt();
        int edat2 = ent.nextInt();
        int edat3 = ent.nextInt();
        int edat4 = ent.nextInt();
        int edat5 = ent.nextInt();
        if (edat1 < 30) joves++;
        if (edat2 < 30) joves++;
        if (edat3 < 30) joves++;
        if (edat4 < 30) joves++;
        if (edat5 < 30) joves++;

        System.out.println(joves);

    }
}
