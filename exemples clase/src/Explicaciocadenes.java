import java.util.Scanner;
import java.util.SplittableRandom;

public class Explicaciocadenes {

    public static void main(String[] args) {
        Explicaciocadenes objecte = new Explicaciocadenes();

        Scanner ent = new Scanner(System.in);

        String cadena = new String("soc un manin");
        cadena = "Soc un manin";

        if (cadena.startsWith("Soc")) System.out.println("el text comença per Soc");



    }

}
class String2{

    public static void main(String[] args) {
        String text = "jagjjfbjghwjfhqfbogu";
        int compta = 0;
        int index = text.indexOf('j');

        while (index != -1) {
            compta++;
            index = text.indexOf('j',index +1); //comença des de 0
            //index = text.lastIndexOf('j',index +1)); // comença des de l'ultima lletra

        }
        System.out.println("hi ha " + compta + " j's");

    }




}
class String3{
    public static void main(String[] args) {

        String tet = "12,34,56,9,-1";
        String[] paraules = tet.split(",");
        int[] numeros = new int[paraules.length];
        int suma = 0;

        for (int i = 0; i < paraules.length; i++) {
            System.out.println( paraules[i]);
            numeros[i] = Integer.valueOf(paraules[i]);
            suma += Integer.valueOf(paraules[i]);

        }

    }
}
