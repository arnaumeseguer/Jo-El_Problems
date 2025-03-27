import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Baseperaltura {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        float altura = ent.nextInt();
        float base = ent.nextInt();

        float area = (base * altura) / 2;
        System.out.println(area);
    }
}