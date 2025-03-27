import java.util.Scanner;
class exemples {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;

        //System.out.println("Introdueix un enter (0 per acabar)");
        //int num = ent.nextInt();
        //System.out.println(num);
        //útil quan volem que el cos s'utilitze al menys una vegada

        do {
            System.out.println("Introdueix un enter (0 per acabar)");
            num = ent.nextInt();
            System.out.println(num);
        } while (num != 0) ;



    }}