import java.util.Scanner;
public class Ambrosio {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);


    //variables d'enrada
        int casos = ent.nextInt();
        int pisos = ent.nextInt();

        //varaibles de sortida
        int estat = 1;
        int suma = 0;
        int fi = 0;


    while(fi < casos){



        while (estat <= pisos){
            suma += estat*estat;
            estat++;






        }
        System.out.println(suma);
        estat = 1;
        suma = 0;
        fi++;
        if(fi >= casos) break;
        pisos = ent.nextInt();










    }
}}
