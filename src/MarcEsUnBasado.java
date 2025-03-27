import java.util.Scanner;

public class MarcEsUnBasado {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int Dia = ent.nextInt();

        if (Dia == 1) System.out.println("Monday");
        if (Dia == 2) System.out.println("Tuesday");
        if (Dia == 3) System.out.println("Wednesday");
        if (Dia == 4) System.out.println("Thursday");
        if (Dia == 5) System.out.println("Friday");
        if (Dia == 6) System.out.println("Saturday");
        if (Dia == 7) System.out.println("Sunday");
    }
}
