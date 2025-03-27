import java.util.Scanner;


public class BolasLobas {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();


        for (int i = 0; i < casos ; i++) {
            String text = ent.skip("\r\n]*").nextLine();
            int p1 = ent.nextInt();
            int p2 = ent.nextInt();

            for (int j = 0; j < text.length() - 1; j++){
                if (j != p1 && j != p2) System.out.format("%c", text.charAt(j));
                else if (j == p1) System.out.printf("%c" , text.charAt(p2));
                else System.out.printf("%c" , text.charAt(p1));



            }
            

        }

    }
}
