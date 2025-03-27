import java.util.Scanner;

public class RestaurarTodo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int status = ent.nextInt();
        int hp = ent.nextInt();
        int maxHp = ent.nextInt();

        if (hp == 0) System.out.println("DEBILITAT");
        else if (hp < maxHp && status == 0) System.out.println("CURAR");
        else if (hp == maxHp && status != 0) System.out.println("ESTAT");
        else if (hp < maxHp && status != 0) System.out.println("CURAR I ESTAT");
        else System.out.println("RES");
    }
}
