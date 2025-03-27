import java.util.Scanner;
public class NumerosBinarisVectors {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        ent.nextLine();
        for (int i = 0; i < casos; i++) {
            int numero = 0;
            String operacio[] = ent.nextLine().trim().split(" ");
            if (operacio[1].equals("+")) {
                numero = Integer.parseInt(operacio[0]) + Integer.parseInt(operacio[2]);
            } else {
                numero = Integer.parseInt(operacio[0]) - Integer.parseInt(operacio[2]);
            }


            int[] vector = new int[numero];
            if (numero == 0) System.out.println(0);
            else {
                int index = 0;
                while (numero != 0) {
                    vector[index] = numero % 2 ;
                    numero = numero / 2;
                    index++;
                }
                //mostrem les caselles del vector de dreta a esquerra
                for (int j = index - 1; j >= 0; j--) {
                    System.out.print(vector[j]);
                }
                System.out.println();
            }
        }
    }
}
