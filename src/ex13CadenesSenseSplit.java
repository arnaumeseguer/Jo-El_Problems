import java.util.Scanner;
public class ex13CadenesSenseSplit {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text;
        int ini = 0;

        //demanem el text a l'usuari
        do {
        System.out.println("Escriu una frase no buida");
        text = ent.nextLine().trim();
        if (text.isBlank()){
            System.out.println("T'he dit que no pot ser buida!!");
            continue;
            }
        break;
        }while (true);

        //ens correm en el text (recorrer el text) retallant paraules que conte buscant espais en blanc

        do {
            int fi = text.indexOf(' ', ini);

            if (ini == fi) {
                ini++;
                continue;
            }
            if (fi != -1) //hem trobat espai en blanc
                System.out.println(text.substring(ini, fi));
            else {//no hem trobat capespai en blanc, per tant estem al final de la frase
                System.out.println(text.substring(ini));
            break;
            }
            ini = fi+1;
        }while (true);

    }
}
