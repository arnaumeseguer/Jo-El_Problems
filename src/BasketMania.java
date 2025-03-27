import java.util.Scanner;
public class BasketMania {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int partits = ent.nextInt();

        String[] jugada;
        int local = 0;
        int visitant = 0;

        for (int i = 0; i < partits ; i++) {

            int casos = ent.nextInt();


        for (int j = 0; j < casos; j++) {
            String text = ent.skip("[\r\n]*").nextLine();
            jugada = text.split(" ");
            int punts = Integer.valueOf(jugada[1]);
            String equip = String.valueOf(jugada[0]);


            if (equip.equals("L")) local += punts;
            else if (equip.equals("V")) visitant += punts;




        }
        if (local > visitant) System.out.println("L " + local + " " + visitant);
        else if (visitant > local) System.out.println("V " + local + " " + visitant);
        else if (local == visitant) System.out.println("E " + local + " " + visitant);

        local = 0;
        visitant = 0;
    }}
}
