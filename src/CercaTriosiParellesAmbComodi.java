import java.util.Scanner;

public class CercaTriosiParellesAmbComodi {
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {

        int a = ent.nextInt();
        int b = ent.nextInt();
        int c = ent.nextInt();

        if (a == b && b == c || a == b && c == 0 || a == c && b == 0 || b == c && a == 0){
            System.out.println("TRIO");
        }else if (a != b && a != c  && b != c && a != 0 && b != 0 && c != 0){
            System.out.println("RES");
        } else System.out.println("PARELLA");

    }
}
