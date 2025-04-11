import java.util.Scanner;

public class Detector_de_Llenguatge {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String acomiadament = ent.nextLine();

        switch (acomiadament.toUpperCase()){
            case "ADIOS": {
                System.out.println("ES");
                break;
            }
            case "GOOD BYE": {
                System.out.println("UK");
                break;
            }
            case "AU REVOIR": {
                System.out.println("FR");
                break;
            }
            case "CIAO": {
                System.out.println("IT");
                break;
            }
            case "DOEI": {
                System.out.println("NL");
            }
            case "TSCHUSS": {
                System.out.println("DE");
            }

            default: {
                System.out.println("??");

            }
        }

    }
}
