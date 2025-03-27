import java.util.Scanner;

public class DesiertoDelSinai {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.skip("[\n\r]*").nextInt(); // Nombre de casos

        for (int i = 0; i < casos; i++) {
            int vots = ent.skip("[\n\r]*").nextInt();
            String[] mapes = new String[vots];
            int[] comptadors = new int[vots];
            int index = 0;

            for (int j = 0; j < vots; j++) {
                String mapa = ent.nextLine().trim();
                boolean trobat = false;


                for (int k = 0; k < index; k++) {
                    if (mapes[k].equals(mapa)) {
                        comptadors[k]++;
                        trobat = true;
                        break;
                    }
                }


                if (!trobat) {
                    mapes[index] = mapa;
                    comptadors[index] = 1;
                    index++;
                }
            }


            int mesVots = 0;
            String mapaVotat = "";
            for (int j = 0; j < index; j++) {
                if (comptadors[j] > mesVots) {
                    mapaVotat = mapes[j];
                }
            }


            System.out.println(mapaVotat);
        }
    }
}
