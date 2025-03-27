import java.util.Scanner;

public class DiaDeLaSetmana2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dia = ent.nextInt();

        if (dia % 7 == 1) System.out.println("Monday");
        else if (dia % 7 == 2) System.out.println("Tuesday");
        else if (dia % 7 == 3) System.out.println("Wednesday");
        else if (dia % 7 == 4) System.out.println("Thursday");
        else if (dia % 7 == 5) System.out.println("Friday");
        else if (dia % 7 == 6) System.out.println("Saturday");
        else if (dia % 7 == 0) System.out.println("Sunday");
    }
}
