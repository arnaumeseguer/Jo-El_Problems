import java.util.Scanner;
public class Hogwarts {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String loquesediu = ent.nextLine();

        if(loquesediu.equals("Coratge")) System.out.println("Gryffindor");
        else if(loquesediu.equals("Coneixement")) System.out.println("Ravenclaw");
        else if (loquesediu.equals("Ambicio")) System.out.println("Slytherin");
        else System.out.println("Hufflepuff");

}}
