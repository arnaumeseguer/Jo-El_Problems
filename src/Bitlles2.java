import java.util.Scanner;

public class Bitlles2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        int bitlles;
        int files;

        for (int i = 0; i < casos; i++) {
            bitlles = ent.nextInt();
            files = 0;
            for (int j = 0; bitlles > j ; j++) {
                bitlles -= j;
                files = j;

                
            }
            System.out.println(files);
        }
    }
}
