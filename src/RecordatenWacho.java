import java.util.Scanner;
public class RecordatenWacho {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();

        while (casos-- > 0){
            int llargada = ent.nextInt();
            int[] vector = new int[llargada];

            for (int i = 0; i < vector.length; i++) {
                vector[i] = ent.nextInt();

            }
            int posicio = ent.nextInt();
            int resultat = vector[posicio];


            System.out.println(resultat);

        }

    }
}
