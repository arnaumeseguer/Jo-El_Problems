import java.util.Scanner;
public class BloodborneVersioStrings {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();

        while (casos -- > 0){

            String paraula = ent.skip("[\n\r]*").nextLine();

            boolean trobat = false;
            // Aqui fica: mentres i sigue mes gran
            // que index i trobat sigue fals, itera
            for (int i = 0; !trobat && i + 1 < paraula.length() ; i++) {
                if (paraula.charAt(i) == paraula.charAt(i + 1)) trobat = true;


            }

            System.out.println(trobat? "SI" : "NO");


        }
    }
}
