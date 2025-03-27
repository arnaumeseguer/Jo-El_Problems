import java.util.Scanner;

public class ArredonirJiji {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);



        double nombre = ent.nextDouble();
        nombre = (int)(nombre*10)/10.0;

        System.out.println(Math.round(nombre));
    }
}
