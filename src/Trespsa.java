import java.util.Scanner;
public class Trespsa {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int any = ent.nextInt();

        if (any % 400 == 0)  System.out.println("SI");
        else if (any % 100 == 0 && any % 4 == 0) System.out.println("NO");
        else if (any % 4 == 0) System.out.println("SI");

        else System.out.println("NO");
    }
}
