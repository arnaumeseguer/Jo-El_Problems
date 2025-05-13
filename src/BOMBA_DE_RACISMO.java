import java.util.Scanner;

public class BOMBA_DE_RACISMO {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int tamanyLlista = ent.nextInt();
        String[] paisosLlista;

        if (tamanyLlista == 0) {
            paisosLlista = new String[]{null, null, null, null};
        } else {
            paisosLlista = ent.skip("[\r\n]*").nextLine().split(", ");
        }

        while (true) {
            String pais = ent.skip("[\r\n]*").nextLine();
            if (pais.equals("Llarga vida al President")) {
                break;
            }
            boolean formaPart = false;
            for (String paisLlista : paisosLlista) {
                if (pais.equals(paisLlista)) {
                    formaPart = true;
                    break;
                }
            }
            if (formaPart) {
                System.out.println("Bomba de racismo");
            } else {
                System.out.println("Bomba de racimo");
            }
        }
    }
}