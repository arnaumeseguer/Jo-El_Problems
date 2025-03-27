import java.util.Scanner;
public class camellSnakeinosequemes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);


        int casos = ent.nextInt();
        String text = ent.nextLine();

        while(casos-- > 0){




            char lletra = ent.skip("[n\r]*").nextLine().charAt(0);
            String[] paralues = ent.skip("[n\r]*").nextLine().split(" ");
            String resultat = "";

            switch (lletra){
                case 'P':
                    for (int i = 0; i < paralues.length; i++) {
                        resultat += paralues[i].toUpperCase().charAt(0)+paralues[i].toLowerCase().substring(1);

                    }
                    break;

                case 'K':
                    for (int i = 0; i < paralues.length; i++) {
                        resultat += paralues[i].toLowerCase();
                        //sha de afegir un guio despres de cada paraula
                        if (i != paralues.length - 1) resultat += '-';
                    }
                    break;
                case 'S':
                    for (int i = 0; i < paralues.length; i++) {
                        resultat += paralues[i].toLowerCase();
                        if (i != paralues.length - 1) resultat += '_';
                    }
                    break;
                case 'C':
                    for (int i = 0; i < paralues.length; i++) {
                        if (i == 0) resultat += paralues[i].toLowerCase();
                        else resultat += paralues[i].toUpperCase().charAt(0)+paralues[i].toLowerCase().substring(1);
                    }
                    break;
            }
            System.out.println(resultat);

        }
    }
}
