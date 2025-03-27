import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Explicacionssi {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int contador = 0;

        //Demanem frases a l'usuari i comptem les que comencen en 'a' o 'A'
        //Ha d'escriure Fi per acabar (o qualesvol variant en majuscules/minuscules)

        System.out.println("Introdueix una frase (escriu Fi per acabar)");
        do{
            String frase = ent.nextLine().toUpperCase(); //Transforma el text llegit a majúscules
            if (frase.equals("FI")) break;
            if (frase.isBlank() || frase.charAt(0) != 'A') continue;
            //increment sense condició
            contador++;

        }while (true);

        System.out.printf("Surto del programa ie he posat %d linies que comencen per 'a' o 'A'%n", contador);




    }
}

class formatge{
    public static void main(String[] args) {
        String text = "Soc text";

        for (int i = 0; i < text.length(); i++) {
            System.out.format("%c %1$C  %d  %n",text.charAt(i), (int)text.charAt(i));

        }

        for (int i = 97; i < 130; i++) {
            System.out.format("%c %1$C %1$d %n",i);

        }
    }
}
