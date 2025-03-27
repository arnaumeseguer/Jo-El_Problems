import java.util.Scanner;
public class ContadorDeNotes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int compt, cMDs, cIs, cSs, cBs, cNs, cEs;
        compt = cMDs = cIs = cSs = cBs = cNs = cEs = 0;
        float sumaNotes = 0F;

        //Llegim primera nota

        float nota = ent.nextFloat();


        //Bucle per llegir la resta de notes

        while (nota != -1.0F) {
            //Tractem la nota que acabem de llegir
            if (nota >= 0.0F && nota <= 10.0F){
                compt++;
                sumaNotes += nota;
                if (nota <= 3.0F) cMDs++;
                else if (nota < 5.0F) cIs++;
                else if (nota < 6.0F) cSs++;
                else if (nota < 7.0F) cBs++;
                else if (nota < 9.0F) cNs++;
                else cEs++;
            }
            //Llegim la següent nota
            nota = ent.nextFloat();
        }

        //Mostrem el resultat
        System.out.println("NOTES: " + compt +" MITJANA: " + ((float)sumaNotes/compt) + " E: " + cEs + " N: " + cNs + " B: " + cBs + " S: " + cSs + " I: " + cIs + " MD: " + cMDs);





    }
}
