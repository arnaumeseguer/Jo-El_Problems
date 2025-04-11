import java.util.Scanner;

public class UnBuenMomentoParaUnaBuenaBanana {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();

        for (int i = 0; i < casos; i++) {
            int vida = ent.nextInt();
            int dany = ent.nextInt();

            if (dany > vida*0.2 && dany < vida) {
                System.out.println("Momento Banana");
            } else System.out.println("Nope");
        }
    }
}
