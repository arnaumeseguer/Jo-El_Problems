import java.util.Scanner;
public class Divisors {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        int pasos = 0;
        int nombre = ent.nextInt();

        int resultats;



        for (int i = 1; i < casos; i++) {
            for (int j = 0; j <= nombre; j++) {
                resultats = j % nombre;


                    System.out.print(resultats + " ");

                }
                pasos++;


            }
            nombre = ent.nextInt();
        }
    }

