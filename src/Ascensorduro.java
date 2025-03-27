import java.util.Scanner;
public class Ascensorduro {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int pismin = ent.nextInt();
        int pismax = ent.nextInt();
        int pisinicial = ent.nextInt();

        //varibales de la sortida

        int qMoviments = 0;
        int qPisos = 0;
        int fi = pisinicial; //si no hi ha moviments el valor del final sera el mateix que el
        boolean hihaincorrectes = false;

        //bucle para llegir la resta de valors.

        do {
            //llegim un valor usant "nextLine" per que pot ser numèric o text
            String pisText = ent.next();
            if (pisText.equalsIgnoreCase("x")) break; //el break acaba el bucle sempre, i e aquest cas al
                //rebre una x.
            else { //hem entrat ja que pisactual es un numero
                int pis = Integer.valueOf(pisText);

                //calculs de pisos
                if (pis < pismin || pis > pismax) {   //Pis incorrecte
                    hihaincorrectes = true;
                }else{                                //Pis correcte
                    if (pis != fi){
                        qMoviments++;

                        if (pis > fi) qPisos += pis-fi;
                        else qPisos += fi-pis;

                        fi = pis;
                    }
                }

            }
        }while(true);

        //mostrem el resultat
        System.out.println(qMoviments + " " + qPisos + " " + fi + (hihaincorrectes ? " E":""));

        }}