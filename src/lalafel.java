import java.util.Scanner;
public class lalafel {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();

        while (casos-- > 0){

        String[] paraules = ent.skip("[\r\n]*").nextLine().split(", ");
        int neccesaris = ent.nextInt();


        int lalafels = 0;
        int plenes = 0;


        for (int i = 0; i < paraules.length; i++) {
            switch (paraules[i].toLowerCase()){
                case "lalafel":
                    lalafels++;
                    break;
                case "telaranya":
                    if (neccesaris > 0 && lalafels >= neccesaris) {
                        plenes++ ;
                        lalafels -= neccesaris;
                    }
                    break;
                case "aranya":
                    lalafels = plenes = 0;
                    break;
            }
        }

        //mostrem result
        //System.out.println("Hay " + plenes + " telaranyas llenas");
        System.out.format("Hay %d telaranyas llenas.%n",plenes);
    }
}}
