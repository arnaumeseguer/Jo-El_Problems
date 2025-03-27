import java.util.Scanner;

public class ElNenMesAlt {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int alcadaMaxima = ent.nextInt();
        int altura1 = ent.nextInt();
        int altura2 = ent.nextInt();
        int altura3 = ent.nextInt();

        if (altura1 > alcadaMaxima) altura1 = 0;
        if (altura2 > alcadaMaxima) altura2 = 0;
        if (altura3 > alcadaMaxima) altura3 = 0;

        if (altura1 == 0 && altura2 == 0 && altura3 == 0) System.out.println("No hi ha cap nen");
        else if (altura1 > altura2 && altura1 > altura3) System.out.println("Nen 1");
        else if (altura2 > altura1 && altura2 > altura3) System.out.println("Nen 2");
        else System.out.println("Nen 3");


    }
}
