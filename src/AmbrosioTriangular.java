import java.util.Scanner;
public class AmbrosioTriangular {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);


        //variables d'enrada
        int casos = ent.nextInt();
        int pisos = ent.nextInt();

        //varaibles de sortida
        int estat = 1;
        int suma = 0;
        int total = 0;
        int fi = 0;



        while(fi < casos) {


            while (estat <= pisos) {
                suma += estat ; //Necessito una operació algebraica que em done las suma de la fila següent mes la
                                      // suma anterior de tots
                total += suma;
                estat++;


            }
            System.out.println(total);
            estat = 1;
            suma = 0;
            total = 0;
            fi++;
            if (fi >= casos) break;
            pisos = ent.nextInt();


        }













    }
}
