import java.util.Scanner;
public class sumasegon {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int hores = ent.nextInt();
        int minuts = ent.nextInt();
        int segons = ent.nextInt();

        segons++;
        if (segons == 60) {
            segons = 0;
            minuts++;
        }
        if (minuts == 60){
            minuts = 0;
            hores++;
        }

        if (hores == 24) hores = 0;

        System.out.println(hores + " " + minuts+ " " + segons);
    }
}
