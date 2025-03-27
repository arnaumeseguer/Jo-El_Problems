import java.util.Scanner;
public class quadra_t {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //quadra't es paregut a ambrosio, lo dixo com a referència


        //variables d'enrada
        int casosp = ent.nextInt();
        int files = ent.nextInt();
        int columnes = ent.nextInt();

        int quadrats = 0;
        int casosr = 0;
        int mides_quadrat = 1;

        while (casosr < casosp){
            while(mides_quadrat <= files && mides_quadrat <= columnes) {
            quadrats += (files - mides_quadrat + 1) * (columnes - mides_quadrat + 1);
            mides_quadrat++;
            }

            System.out.println(quadrats);
            mides_quadrat = 1;
            quadrats = 0;
            casosr++;
            if(casosr == casosp) break;
            files = ent.nextInt();
            columnes = ent.nextInt();


        }











        }
    }
