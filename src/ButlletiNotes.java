import java.util.Scanner;

public class ButlletiNotes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int Nota = ent.nextInt();

        if (Nota < 5) System.out.println("Suspes");
        else if (Nota >= 5 && Nota < 7) System.out.println("Aprovat");
        else if (Nota >= 7 && Nota < 9) System.out.println("Notable");
        else System.out.println("Excelent");
    }
}
