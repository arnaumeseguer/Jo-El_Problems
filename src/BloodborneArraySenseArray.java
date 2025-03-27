import java.util.Scanner;
public class BloodborneArraySenseArray {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();


        while (casos -- > 0) {

            int llargada = ent.nextInt();
            boolean trobat =false;

            if (llargada > 1) {
                int anterior = ent.nextInt();
                while (llargada-- > 0) {
                    int actual = ent.nextInt();
                    if (anterior == actual) trobat = true;
                    anterior = actual;


                }
                System.out.println(trobat ? "SI" : "NO");
            }
        }
    }
}

