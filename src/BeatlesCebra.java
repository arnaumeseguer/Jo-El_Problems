import java.util.Scanner;



public class BeatlesCebra {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int files = ent.nextInt();
        int columnes = ent.nextInt();
        int primerafila = ent.nextInt();
        char x;                             //per escriure el valor de les files

        //assigno 1 o 0 a x depenent de si el valor primerafila es parell o imaprell

        x = primerafila % 2 == 0 ? '1': '0';


    //bucle de creacio de files
        for (int i = 0; i < files; i++) {

            //bucle para columnes
            for (int j = 0; j < columnes; j++) {
                System.out.print(x + " "); //print sense el ln no introdueix salt de linia.


            }

            //preparem x i sortida para la següent iteració
            x = x =='1' ? '0' : '1'; //aixo podria ser: if (x == '1') x = '0';
                                                      //else; x = '1'
            System.out.println();
        }
    }
}







