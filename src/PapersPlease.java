import java.util.Scanner;

public class PapersPlease {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int noMinja = 0;
        int[] familiars = new int[ent.nextInt()];
        for (int i = 0; i < familiars.length; i++) {
            familiars[i] = ent.nextInt();


        }
        int edatMinima = ent.nextInt();

        for (int i = 0; i < familiars.length; i++) {
            if (familiars[i] < edatMinima) noMinja++;



        }
        System.out.println(noMinja);

    }
}
