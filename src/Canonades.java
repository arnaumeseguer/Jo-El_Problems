import java.util.Scanner;

public class Canonades {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double Canonada = ent.nextDouble();


        if (Canonada <= 25) {
            double Preu1 = Canonada * 3;
            System.out.printf("%.1fm: %.1f euros", Canonada, Preu1);
        } else if (Canonada > 25 && Canonada <= 75) {
            double Preu1 = (Canonada - (Canonada - 25)) * 3;
            double Preu2 = (Canonada - 25) * 4;
            double Total = Preu1 + Preu2;
            System.out.printf("%.1fm: %.1f euros", Canonada, Total);
        } else if (Canonada > 75) {
            double Preu1 = (Canonada - (Canonada - 25)) * 3;
            double Preu2 = (Canonada - (Canonada - 50)) * 4;
            double Preu3 = (Canonada - 75) * 5;
            double Total = Preu1 + Preu2 + Preu3;
            System.out.printf("%.1fm: %.1f euros", Canonada, Total);
        }
    }
}
