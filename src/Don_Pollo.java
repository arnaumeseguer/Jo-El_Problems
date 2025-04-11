import java.util.Scanner;

public class Don_Pollo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();
        int puntuacioMinima;

        for (int i = 0; i < casos; i++) {
            puntuacioMinima = ent.nextInt();
            String[] plats = ent.skip("[\r\n]*").nextLine().split(" ");
            int plat1 = Integer.parseInt(plats[0]);
            int plat2 = Integer.parseInt(plats[1]);
            int plat3 = Integer.parseInt(plats[2]);
            if (plat1 + plat2 + plat3 >= puntuacioMinima) {
                System.out.println("Lingan guli guli guli guacha!");
            } else System.out.println("El que quiera perder su tiempo que lo pierda");

        }
    }
}
