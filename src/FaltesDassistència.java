import java.util.Scanner;

public class FaltesDassistència {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int horesUF = ent.nextInt();
        int faltesNJ = ent.nextInt();
        int faltesJ = ent.nextInt();

        if (faltesJ > horesUF*0.1) System.out.println("NO");
        else if (faltesJ + faltesNJ > horesUF*0.2) System.out.println("NO");
        else System.out.println("SI");
    }
}
