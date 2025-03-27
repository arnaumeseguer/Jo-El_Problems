import java.util.Scanner;
public class mesexplicasionscadenes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String numero = "19129048018";

        System.out.println(numero.substring(0));
        System.out.println(numero.substring(numero.length()));
        //System.out.println(numero.substring(-2)); aixo dona error clarament
        //System.out.println(numero.substring(numero.length()+ 1)); aixo tambe
        //System.out.println(numero.substring(3, 2));
        System.out.println(numero.substring(0,numero.length()));
        System.out.println(numero.substring(2, 3));


        String nom_complet = "Sabaté Sanz, Santiago";
        String nom = nom_complet.substring(nom_complet.indexOf(", ")+2);

        System.out.printf("El teu nom és %s",nom);;

















            }
        }
class Trim{
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String text;
        do{
            System.out.println("Introdueix un text (FI per acabar)");
            text = ent.nextLine();

        }while (!text.trim().equalsIgnoreCase("FI"));
        }








    }

