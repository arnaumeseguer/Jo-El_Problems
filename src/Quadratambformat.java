import java.util.Scanner;
public class Quadratambformat {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float nombre = ent.nextFloat();
        float resultat = nombre*nombre;

        System.out.printf(" %015.3f %n", resultat);
    }
}
