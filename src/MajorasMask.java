import java.util.Scanner;
public class MajorasMask {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int segons = ent.nextInt();
        int dies = segons / 86400;
        float dianit = (segons % 86400);



        if (dianit < 43200) System.out.println("mati del dia " + (dies + 1));
        else System.out.println("nit del dia " + (dies + 1));
    }
}
