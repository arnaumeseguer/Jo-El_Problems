import java.util.Scanner;

public class ElsExDeBambino {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int A = ent.nextInt();
        int B = ent.nextInt();
        int C = ent.nextInt();
        int N = ent.nextInt();


        if (N == A || N == B || N == C) System.out.println("NO");
        else System.out.println("SI");
    }
}
