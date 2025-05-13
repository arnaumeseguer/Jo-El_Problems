import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TipusDeVi {
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);

        String nom = ent.skip("[\n\r]*").nextLine();
        int mesos = ent.nextInt();
        String tipus = ent.skip("[\n\r]*").nextLine();
        String categoria;
        double preu = 0;

        if (tipus.equals("rosat")) preu = 3;
        else if (tipus.equals("blanc")) preu = 4;
        else if (tipus.equals("negre")) preu = 5;
        else {
            System.out.println("No disposem d'aquest vi");
            return;
        }

        if (mesos >= 18 && mesos < 24) {
            categoria = "Noble";
            preu += 1;
        } else if (mesos >= 24 && mesos < 36) {
            categoria = "Criança";
            preu += 1.2;
        } else if (mesos >= 36 && mesos < 60) {
            categoria = "Anyenc";
            preu += 1.5;
        } else if (mesos == 60) {
            categoria = "Gran Reserva";
            preu += 5;
        } else {
            System.out.println("No disposem d'aquest vi");
            return;
        }

        out.printf("%s es un vi %s, catalogat com %s i te un preu de %.1f€\n",
                nom, tipus, categoria, preu);
    }
}