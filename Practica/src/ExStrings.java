import java.util.Scanner;

public class ExStrings {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text = "";
        String linia = "";
        int compt = 0;

        System.out.println("Introdueix una linia de text:");
        do {
            linia = ent.nextLine();
            if (!linia.isBlank())compt++;
            if (!text.endsWith(".")) text = text+linia+"\n";
            else text = text +linia;

        }while (!linia.endsWith("."));

        System.out.println("has escrit: " + text);
        System.out.printf("El text conté %d linies no buides", compt);











    }
}
