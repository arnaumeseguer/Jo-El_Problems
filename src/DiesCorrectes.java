import java.util.Scanner;

public class DiesCorrectes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dia = ent.nextInt();

        if (dia <= 0 || dia > 366) System.out.println("Incorrecte!");
        else if (dia < 366) System.out.println("Correcte per un any no bixest!");
        else System.out.println("Correcte per un any bixest!");
    }
}
