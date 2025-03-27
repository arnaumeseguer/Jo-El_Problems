import java.util.Scanner;
public class DiesCorrectes2 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int dia = ent.nextInt();
        int any = ent.nextInt();

        if (dia <= 0 || dia > 366 || any < 0) System.out.println("Incorrecte per qualsevol any!");
        else if (dia == 366 && any % 400 == 0)  System.out.println("Correcte i any bixest!");
        else if (dia < 366 && any % 400 == 0)  System.out.println("Correcte i any qualsevol!");
        else if (dia == 366 && any % 100 == 0 && any % 4 == 0) System.out.println("Incorrecte per any no bixest!");
        else if (dia == 366 && any % 4 == 0) System.out.println("Correcte i any bixest!");
        else if (dia < 366 && any % 4 == 0) System.out.println("Correcte i any qualsevol");

    }
}
