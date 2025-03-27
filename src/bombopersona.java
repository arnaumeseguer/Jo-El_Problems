import java.util.Scanner;
public class bombopersona {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int alumnes = ent.nextInt();
        int bombons = ent.nextInt();

        int sobren = bombons - alumnes;
        int falten = alumnes - bombons;

        if (alumnes == 0 && bombons == 0) System.out.println("KO: 0");
        else if (alumnes == bombons) System.out.println("OK");
        else if (alumnes > bombons) System.out.println("KO: " + falten);
        else if (bombons > alumnes) System.out.println("OK: " + sobren);

    }
}
