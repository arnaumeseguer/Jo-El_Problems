import java.util.Scanner;
    public class OperadorsDeRelacio {
        public static void main(String[] args) {

            Scanner ent = new Scanner(System.in);

            float a = ent.nextFloat(); float b = ent.nextFloat();

            if (a > b) System.out.println(">");
            else if (a < b) System.out.println("<");
            else System.out.println("=");
        }
}
