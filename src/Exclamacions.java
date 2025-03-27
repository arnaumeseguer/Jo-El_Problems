import java.util.Scanner;

public class Exclamacions {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String frase = ent.nextLine();

        while (!frase.equals("FIN")) {
            int comptOberts = 0;
            int comptTancats = 0;

            int i = 0;
            while (i < frase.length()){
                if (frase.charAt(i) == '!') comptTancats++;
                else if (frase.charAt(i) == '¡')comptOberts++;

                i++;
            }
            System.out.println(comptOberts == comptTancats ? "SI" : "NO");

            frase = ent.nextLine();


    }
}}
