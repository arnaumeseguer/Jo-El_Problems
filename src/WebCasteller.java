import java.sql.SQLOutput;
import java.util.Scanner;

public class WebCasteller {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        String paraulallarga;
        String paraulacurta;

        for (int i = 0; i < casos; i++) {
            String paraula1 = ent.skip("[\r\n]*").nextLine();
            String paraula2 = ent.skip("[\r\n]*").nextLine();

            if (paraula1.length() > paraula2.length()) paraulallarga = paraula1; paraulacurta = paraula2;




        }
    }
}
