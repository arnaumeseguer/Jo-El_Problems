import java.util.Scanner;
public class okboomer {
    public static void main(String[] args) {
        Scanner ent= new Scanner(System.in);

        int anys = ent.nextInt();

        if (anys > 1965 || anys < 1945) System.out.println("nah");
        else System.out.println("ok boomer");
    }
}
