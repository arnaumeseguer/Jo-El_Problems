import java.util.Scanner;
public class parelles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int carta1 = ent.nextInt();
        int carta2 = ent.nextInt();
        int carta3 = ent.nextInt();

        if(carta1 == carta2 && carta2 == carta3) System.out.println("SI");
        else System.out.println("NO");
    }
}
