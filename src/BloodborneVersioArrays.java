import java.util.Scanner;
public class BloodborneVersioArrays {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();


        while (casos -- > 0) {

            int llargada = ent.nextInt();
            int[] vector = new int[llargada];
            boolean trobat= false;


            for (int i = 0; i < llargada; i++) {
                vector[i] = ent.nextInt();
            }

            for (int i = 0; !trobat && i + 1 < llargada ; i++) {
                if (vector[i] == vector[i+1]) trobat = true;



            }
            System.out.println(trobat ? "SI" : "NO");

        }
    }
}

