import java.util.Scanner;

public class Ex14DeSanti {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //demanem la dimensió de la matriu i forcem que sigue mes gran que 0
        int n;
        do {
            System.out.println("Introdueix les dimensions de la matriu (>=1)");
            n = ent.nextInt();
            if (n < 1) System.out.println("Ha de ser més gran que 0!");
            else break;
        }while (true);

        //Mostrem el resultat
        char lletra = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2c",lletra );;
               //fem que les lletres sempre siguen d'A a Z
                if (lletra == 'Z') lletra = 'A';
                else lletra++;

            }
            System.out.println();
        }
    }
}


