import java.util.Scanner;
public class NumerosBinaris {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        ent.nextLine();
        for (int i = 0; i < casos; i++) {
            int numero = 0;
            String operacio[] = ent.nextLine().trim().split(" ");
            if (operacio[1].equals("+")) {
                numero = Integer.parseInt(operacio[0]) + Integer.parseInt(operacio[2]);
            } else {
                numero = Integer.parseInt(operacio[0]) - Integer.parseInt(operacio[2]);

            }

            String resultat = "";
            while (numero != 0) {

                resultat = (numero % 2) + resultat;
                numero = numero / 2;
            }
            System.out.println(resultat);

        }


    }}
