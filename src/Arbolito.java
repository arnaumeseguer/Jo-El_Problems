import java.util.Scanner;

public class Arbolito {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);


        float C1 = ent.nextFloat();
        float C2 = ent.nextFloat();
        float C3 = ent.nextFloat();
        float C4 = ent.nextFloat();
        float C5 = ent.nextFloat();



       int total = 0;

        if (C3 > C1 && C3 < C2) total++;
        if (C4 > C1 && C4 < C2) total++;
        if (C5 > C1 && C5 < C2) total++;

        System.out.println(total);

    }
}
