import java.util.Scanner;
public class Suma2 {
    public static void main(String[] args) {
        Scanner ent =  new Scanner(System.in);

        int nombre1 = ent.nextInt();
        int nombre2 = ent.nextInt();

        int solucio = nombre1 + nombre2;

        System.out.println(solucio);

    }
}
