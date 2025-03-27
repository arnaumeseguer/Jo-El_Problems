import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JordiWhile {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int strikes = 0;
        int videos = 0;

        do {
            int viewers = ent.nextInt();

            if (viewers == -1) strikes++;
            else videos++;

            } while (strikes != 3);
        System.out.println(videos);

        }

    }

