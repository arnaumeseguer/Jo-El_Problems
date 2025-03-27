import java.util.Scanner;

public class dimensioInversa {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float nombre = ent.nextFloat();

        if (nombre >= 0)System.out.println(1/nombre);
        else System.out.println(nombre * 10);
    }
}
