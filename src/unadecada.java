import java.util.Scanner;
public class unadecada {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();
        String text = ent.nextLine();
        String[] text2 = text.split(" ");
        boolean minuscula = true;

        while (casos-- > 0) {
        for (int i = 0; i < text2.length; i++) {
          if (minuscula)System.out.println(text2[i].toLowerCase());

          else System.out.println(text2[i].toUpperCase());
          minuscula = true;



            System.out.println();











            }
        }
    }
}
