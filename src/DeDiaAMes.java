import java.util.Scanner;

public class DeDiaAMes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dia = ent.nextInt();

        if (dia <=  31) System.out.println("1");
        else if (dia > 31 && dia <= 59) System.out.println("2");
        else if (dia > 59 && dia <= 90) System.out.println("3");
        else if (dia >  90 && dia <= 120) System.out.println("4");
        else if (dia >  120 && dia <= 151)System.out.println("5");
        else if (dia > 151 && dia <= 181) System.out.println("6");
        else if (dia > 181 && dia <= 212) System.out.println("7");
        else if (dia >  212 && dia <= 243) System.out.println("8");
        else if (dia >  243 && dia <= 273) System.out.println("9");
        else if (dia > 273 && dia <= 304) System.out.println("10");
        else if (dia >  304 && dia <=334) System.out.println("11");
        else System.out.println("12");
    }
}
